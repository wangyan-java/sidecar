package com.test.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class MsSidecarApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsSidecarApplication.class, args);
	}
}
