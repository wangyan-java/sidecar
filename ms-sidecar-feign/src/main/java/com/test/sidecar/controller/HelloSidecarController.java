package com.test.sidecar.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sidecar.feign.MsSidecarFeignclient;
/**
 *	这个不是项目只是演示，在微服务中如何通过sidecar调用第三方语言开发的http服务
 * @author chenl 2018年12月3日
 */
@RestController
@RequestMapping("/sidecar")
public class HelloSidecarController {
	
	@Resource
	private MsSidecarFeignclient fc;
	
	@GetMapping("/hello")
	public String hello () {
		return fc.hello();
	}
	
	@GetMapping("/main")
	public String main () {
		return "ms sidecar feign main page";
	}
}
