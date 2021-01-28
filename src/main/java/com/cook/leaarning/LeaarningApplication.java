package com.cook.leaarning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cook"} )
public class LeaarningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaarningApplication.class, args);
	}

}
