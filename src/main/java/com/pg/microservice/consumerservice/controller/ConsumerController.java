package com.pg.microservice.consumerservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pg.microservice.consumerservice.bean.ConsumerBean;
import com.pg.microservice.consumerservice.proxy.ResumeBuilderServiceProxy;

@RestController
public class ConsumerController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ResumeBuilderServiceProxy proxy;
	
	@GetMapping("/resume-details/{id}")
	public ConsumerBean retrieveResumeDetails(@PathVariable int id) {

		ConsumerBean response = proxy.retrieveConsumer(id);

		logger.info("{}", response);
		
		return new ConsumerBean(id, response.getName(), response.getCollege(), response.getDegree(), response.getEmail(), response.getContact());
	}

}
