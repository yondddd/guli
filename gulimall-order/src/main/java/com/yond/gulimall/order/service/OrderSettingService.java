package com.yond.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yond.common.utils.PageUtils;
import com.yond.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-11 00:07:15
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

