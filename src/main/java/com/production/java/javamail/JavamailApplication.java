package com.production.java.javamail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JavamailApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavamailApplication.class, args);
	}

}
