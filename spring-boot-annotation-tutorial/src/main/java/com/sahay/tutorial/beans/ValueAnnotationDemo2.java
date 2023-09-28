package com.sahay.tutorial.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custom.properties")
public class ValueAnnotationDemo2 {
    @Value("${message}")
	private String message;
    
    public void showMessage() {
    	System.out.println(message);
    }
}
