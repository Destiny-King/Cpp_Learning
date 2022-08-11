package com.wym.rominmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 15:24:17
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

