package com.sahay.tutorial.service;

import org.springframework.stereotype.Service;

@Service
public class ChickenBiryani implements FoodService {
	@Override
	public void makeFood() {
		System.out.println("Chicken Biryani is getting Prepared");

	}
}
