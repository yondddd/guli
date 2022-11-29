package com.yond.gulimall.order.dao;

import com.yond.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-11 00:07:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
