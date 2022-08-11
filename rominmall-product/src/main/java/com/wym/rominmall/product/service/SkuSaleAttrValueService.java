package com.wym.rominmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 15:24:17
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

