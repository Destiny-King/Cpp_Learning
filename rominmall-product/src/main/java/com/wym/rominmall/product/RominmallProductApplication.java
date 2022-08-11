package com.wym.rominmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 1、整合MyBatis-Plus
 */

@MapperScan("com.wym.rominmall.product.dao")
@SpringBootApplication
public class RominmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(RominmallProductApplication.class, args);
	}

}
