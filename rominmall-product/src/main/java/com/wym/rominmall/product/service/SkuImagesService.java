package com.wym.rominmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 15:24:16
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

