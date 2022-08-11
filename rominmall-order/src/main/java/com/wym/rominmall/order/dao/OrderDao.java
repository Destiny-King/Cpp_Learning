package com.wym.rominmall.order.dao;

import com.wym.rominmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 17:52:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
