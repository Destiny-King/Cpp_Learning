package com.wym.rominmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.wym.rominmall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class RominmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(RominmallMemberApplication.class, args);
	}

}
