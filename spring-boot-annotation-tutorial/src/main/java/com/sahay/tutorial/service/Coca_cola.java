package com.sahay.tutorial.service;

import org.springframework.stereotype.Service;

@Service
public class Coca_cola implements Beverages {
	@Override
	public void drink() {
		System.out.println("Enjoy Coca~Cola");

	}
}
