package com.sahay.tutorial.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {
	@Value("${developer.name}")
	private String name;

	public void print() {
		System.out.println(name);
	}
}
