package com.pradip.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		System.out.println("Setter Dependency injection in Spring");
		ApplicationContext context=new ClassPathXmlApplicationContext("SetterDependencyInjection.xml");
		OutputHelper helper=(OutputHelper)context.getBean("helperBean");
		helper.helperMethod();
		
		
	}

}
