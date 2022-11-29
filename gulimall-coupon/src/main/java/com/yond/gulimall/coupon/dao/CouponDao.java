package com.yond.gulimall.coupon.dao;

import com.yond.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-10 23:49:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
