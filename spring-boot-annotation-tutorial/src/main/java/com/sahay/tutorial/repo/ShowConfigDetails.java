package com.sahay.tutorial.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ShowConfigDetails {
	@Value("${database.name}")
    private String dbname;
	@Value("${database.url}")
    private String dburl;
	
	public void show() {
		System.out.println(dbname+"\n"+dburl);
	}
}
