package com.sahay.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sahay.tutorial.beans.TestBean;
import com.sahay.tutorial.service.MuttonBiryani;

import amit.kumar.Bike;
import amit.kumar.Traveler;
import amit.kumar.Vehicle;

//@Configuration and @Bean is used in java based Configuration

@Configuration
@ComponentScan(basePackages = "amit.kumar") //Note: @ComponentScan is always used with @Configuration
public class BeanConfiguration {
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}

	@Bean
	public MuttonBiryani muttonBiryani() {
		return new MuttonBiryani();
	}
	
	@Bean
	public Vehicle vehicle() {
		return new Bike();
	}
	
	@Bean
	public Traveler traveler() {
		return new Traveler(vehicle());
	}
	
}
//IN JAVA BASED CONFIG WE CREATE AND INJECT OBJECT MANUALLY AND HANDOVER TO IOC CONTAINER