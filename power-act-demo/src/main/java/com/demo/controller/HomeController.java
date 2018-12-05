package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	/**
	 *  健康检查路径，方便spring cloud 调用
	 * @return
	 */
	@GetMapping("/health") 
	public Map<String, String> health () {
		Map<String, String> map = new HashMap<>();
		map.put("status", "UP");// UP tmd一定要大写
		return map;
	}
}
