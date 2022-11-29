package com.yond.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yond.common.utils.PageUtils;
import com.yond.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-10 23:49:45
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

