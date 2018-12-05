package com.test.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.test.sidecar.feign")
public class MsSidecarFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsSidecarFeignApplication.class, args);
	}
}
