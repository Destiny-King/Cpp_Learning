package com.wym.rominmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 17:52:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

