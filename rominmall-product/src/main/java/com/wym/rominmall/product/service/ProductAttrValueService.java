package com.wym.rominmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 15:24:16
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

