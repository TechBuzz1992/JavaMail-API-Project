package com.javamailapi.demo;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String emailaddress;

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	

}
