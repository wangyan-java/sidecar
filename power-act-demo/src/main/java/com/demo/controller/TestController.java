package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  测试controller
 * @author chenl 2018年12月3日
 */
@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/hello")
	public String hello () {
		return "hello test sidecar";
	}
	
	@GetMapping("/ms-main")
	public String msMain () {
		RestTemplate restTemplate = new RestTemplate();
		String msMainRs = restTemplate.getForObject("http://localhost:9090/ms-sidecar-feign/sidecar/main", String.class);
		return msMainRs;
	}
}
