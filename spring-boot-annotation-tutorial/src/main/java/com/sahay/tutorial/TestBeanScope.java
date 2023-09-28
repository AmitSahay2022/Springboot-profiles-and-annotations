package com.sahay.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sahay.tutorial.beans.ScopeTutorial;

@Component
public class TestBeanScope {
	@Autowired
   private ScopeTutorial scopeTutorial;
}
