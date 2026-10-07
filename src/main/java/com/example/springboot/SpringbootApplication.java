package com.example.springboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springboot.customer.Customers;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootApplication.class,args);
		
		Customers c=context.getBean(Customers.class);
		c.display();
		
	}

}
