package com.yond.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yond.common.utils.PageUtils;
import com.yond.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-11 00:09:17
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

