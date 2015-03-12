package com.pradip.javaconfig.singleconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {

	public static void main(String[] args) {
		System.out.println("Spring 3 java Configuration file");
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
	OutputGenerator generator=(OutputGenerator)applicationContext.getBean("outputBean");
	generator.generateOutput();
	}
	
}
