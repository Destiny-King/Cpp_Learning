package com.wym.rominmall.coupon.dao;

import com.wym.rominmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 17:35:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
