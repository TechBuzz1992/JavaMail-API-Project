package com.javamailapi.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javamailapi.demo.JavaMailApiProjectApplication;

@SpringBootApplication
public class JavaMailApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JavaMailApiProjectApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
		app.run(args);
	}

}
