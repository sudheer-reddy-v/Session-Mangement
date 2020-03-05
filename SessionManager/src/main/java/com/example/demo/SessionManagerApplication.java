package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SessionManagerApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SessionManagerApplication.class, args);
	}
	
	@Bean
	JdbcTemplate getJDBCTemplate(){
		return new JdbcTemplate();
	}

}
