package com.wym.rominmall.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wym.rominmall.product.entity.ProductAttrValueEntity;
import com.wym.rominmall.product.service.ProductAttrValueService;
import com.wym.common.utils.PageUtils;
import com.wym.common.utils.R;


/**
 * spu属性值
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 16:02:05
 */
@RestController
@RequestMapping("product/productattrvalue")
public class ProductAttrValueController {
	@Autowired
	private ProductAttrValueService productAttrValueService;

	/**
     * 列表
     */
	@RequestMapping("/list")
	//@RequiresPermissions("product:productattrvalue:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = productAttrValueService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
     * 信息
     */
	@RequestMapping("/info/{id}")
	//@RequiresPermissions("product:productattrvalue:info")
	public R info(@PathVariable("id") Long id) {
            ProductAttrValueEntity productAttrValue = productAttrValueService.getById(id);

		return R.ok().put("productAttrValue", productAttrValue);
	}

	/**
     * 保存
     */
	@RequestMapping("/save")
	//@RequiresPermissions("product:productattrvalue:save")
	public R save(@RequestBody ProductAttrValueEntity productAttrValue) {
            productAttrValueService.save(productAttrValue);

		return R.ok();
	}

	/**
     * 修改
     */
	@RequestMapping("/update")
	//@RequiresPermissions("product:productattrvalue:update")
	public R update(@RequestBody ProductAttrValueEntity productAttrValue) {
            productAttrValueService.updateById(productAttrValue);

		return R.ok();
	}

	/**
     * 删除
     */
	@RequestMapping("/delete")
	//@RequiresPermissions("product:productattrvalue:delete")
	public R delete(@RequestBody Long[] ids) {
            productAttrValueService.removeByIds(Arrays.asList(ids));

		return R.ok();
	}

}
