package com.test.sidecar.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ms-sidecar-power-act")
public interface MsSidecarFeignclient {
	@GetMapping("/test/hello")
	public String hello ();
}
