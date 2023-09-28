package com.sahay.tutorial.beans;

import org.springframework.stereotype.Component;

@Component
public class ByDefaultEagerBean {

	public ByDefaultEagerBean() {
		System.out.println("I am By default eager bean, as application starts my instance will be created");
	}
}
