package com.wym.rominmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wym.common.utils.PageUtils;
import com.wym.common.utils.Query;
import com.wym.rominmall.product.dao.CategoryDao;
import com.wym.rominmall.product.entity.CategoryEntity;
import com.wym.rominmall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<CategoryEntity> page = this.page(
				new Query<CategoryEntity>().getPage(params),
				new QueryWrapper<CategoryEntity>()
		);

		return new PageUtils(page);
	}

	@Override
	public List<CategoryEntity> listWithTree() {
		//1、查出所有分类
		List<CategoryEntity> entities = baseMapper.selectList(null);
		//2、组装成父子的树形结构
        
		return entities;
	}

}