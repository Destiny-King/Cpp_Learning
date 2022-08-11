package com.wym.rominmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wym.common.utils.PageUtils;
import com.wym.rominmall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 17:45:26
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

