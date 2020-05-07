package com.pg.microservice.consumerservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pg.microservice.consumerservice.bean.ConsumerBean;

@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="resume-builder-service")
public interface ResumeBuilderServiceProxy {
	
	@GetMapping("/resume-builder-service/api/records/{id}")
	public ConsumerBean retrieveConsumer
		(@PathVariable("id") int id);
}


