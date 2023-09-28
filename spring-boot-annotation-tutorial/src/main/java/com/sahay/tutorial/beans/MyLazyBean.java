package com.sahay.tutorial.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyLazyBean {
	public MyLazyBean() {
		System.out.println("I am lazy bean, If you call me or Autowire me then my instance will be creater");
	}
}
