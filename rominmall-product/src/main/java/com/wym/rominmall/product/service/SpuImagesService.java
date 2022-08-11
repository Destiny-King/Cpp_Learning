package com.wym.rominmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 15:24:17
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

