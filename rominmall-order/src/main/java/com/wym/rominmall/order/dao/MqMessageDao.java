package com.wym.rominmall.order.dao;

import com.wym.rominmall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 17:52:51
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
