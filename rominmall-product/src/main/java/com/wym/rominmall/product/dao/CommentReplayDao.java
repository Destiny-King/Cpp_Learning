package com.wym.rominmall.product.dao;

import com.wym.rominmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 15:24:17
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
