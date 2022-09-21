package com.wym.rominmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 * a.引入依赖
 * b.创建一个bootstrap.properties
 * c.给配置中心默认添加一个叫数据集
 * d.给应用名.properties添加任何配置
 * e.动态获取配置
 * <p>
 * 2、每个微服务创建自己的命名空间，使用配置分组区分环境
 * 3、同时加载多个配置集
 */

@EnableDiscoveryClient
@SpringBootApplication
public class RominmallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(RominmallCouponApplication.class, args);
	}
}
