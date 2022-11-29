package com.yond.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yond.common.utils.PageUtils;
import com.yond.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-10 22:41:54
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

