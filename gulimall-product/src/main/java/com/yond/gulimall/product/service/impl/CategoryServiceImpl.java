package com.yond.gulimall.product.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yond.common.utils.PageUtils;
import com.yond.common.utils.Query;

import com.yond.gulimall.product.dao.CategoryDao;
import com.yond.gulimall.product.entity.CategoryEntity;
import com.yond.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * @return 树形列表
     */
    @Override
    public List<CategoryEntity> listTree() {

        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> rootCategoryList = categoryEntities.stream().filter(x -> x.getParentCid() == 0L).collect(Collectors.toList());
        for (CategoryEntity rootCategory : rootCategoryList) {
            this.setChildren(rootCategory, categoryEntities);
        }
        return rootCategoryList;
    }


    private void setChildren(CategoryEntity parent, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> collect = categoryEntityList.stream().filter(x -> x.getParentCid().equals(parent.getCatId())).sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());
        parent.setChildrenList(collect);
        if (CollectionUtils.isNotEmpty(collect)) {
            for (CategoryEntity categoryEntity : collect) {
                this.setChildren(categoryEntity, categoryEntityList);
            }
        }
    }
}