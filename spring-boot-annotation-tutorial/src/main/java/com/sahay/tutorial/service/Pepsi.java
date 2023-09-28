package com.sahay.tutorial.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Pepsi implements Beverages {

	@Override
	public void drink() {
		System.out.println("Pepsi with snacks");

	}

}
