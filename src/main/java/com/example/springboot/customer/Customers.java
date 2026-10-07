package com.example.springboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	 int custId;
     String custname;
	 String coursename;
	 
	 @Autowired
	 private Technologies techdetail;
	 
	 @Autowired
	 private Zomato zoo;
	 
	 @Autowired
	 private Cricket c;
	 
	 @Autowired
	 private IPL i;
		
	 public void display() {
			
			
			System.out.println("Object created succesfully");
			
			techdetail.tech();
			zoo.Food();
			c.score();
			i.Updates();
		}



}
