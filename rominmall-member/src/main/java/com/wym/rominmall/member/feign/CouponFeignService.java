package com.wym.rominmall.member.feign;

import com.wym.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rominmall-coupon")
public interface CouponFeignService {
	@RequestMapping("/coupon/coupon/member/list")
	public R membercoupons();
}
