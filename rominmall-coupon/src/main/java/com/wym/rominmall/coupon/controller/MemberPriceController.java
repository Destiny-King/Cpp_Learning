package com.wym.rominmall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wym.rominmall.coupon.entity.MemberPriceEntity;
import com.wym.rominmall.coupon.service.MemberPriceService;
import com.wym.common.utils.PageUtils;
import com.wym.common.utils.R;


/**
 * 商品会员价格
 *
 * @author wym
 * @email wym888@gmail.com
 * @date 2022-08-11 17:35:40
 */
@RestController
@RequestMapping("coupon/memberprice")
public class MemberPriceController {
	@Autowired
	private MemberPriceService memberPriceService;

	/**
     * 列表
     */
	@RequestMapping("/list")
	//@RequiresPermissions("coupon:memberprice:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = memberPriceService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
     * 信息
     */
	@RequestMapping("/info/{id}")
	//@RequiresPermissions("coupon:memberprice:info")
	public R info(@PathVariable("id") Long id) {
            MemberPriceEntity memberPrice = memberPriceService.getById(id);

		return R.ok().put("memberPrice", memberPrice);
	}

	/**
     * 保存
     */
	@RequestMapping("/save")
	//@RequiresPermissions("coupon:memberprice:save")
	public R save(@RequestBody MemberPriceEntity memberPrice) {
            memberPriceService.save(memberPrice);

		return R.ok();
	}

	/**
     * 修改
     */
	@RequestMapping("/update")
	//@RequiresPermissions("coupon:memberprice:update")
	public R update(@RequestBody MemberPriceEntity memberPrice) {
            memberPriceService.updateById(memberPrice);

		return R.ok();
	}

	/**
     * 删除
     */
	@RequestMapping("/delete")
	//@RequiresPermissions("coupon:memberprice:delete")
	public R delete(@RequestBody Long[] ids) {
            memberPriceService.removeByIds(Arrays.asList(ids));

		return R.ok();
	}

}
