package com.sahay.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.sahay.tutorial.beans.ScopeTutorial;

@Configuration
public class TestBeanScope3 {
    @Autowired
	private ScopeTutorial scopeTutorial;
}
