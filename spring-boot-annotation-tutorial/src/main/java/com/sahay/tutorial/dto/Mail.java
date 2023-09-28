package com.sahay.tutorial.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custom2.properties")

public class Mail {
	@Value("${mail.id}")
	private String id;
	@Value("${mail.host}")
	private String host;
	@Value("${mail.writter}")
	private String writter;

	public void info() {
		System.out.println(id + " \n" + "" + host + "\n" + writter);
	}

}
