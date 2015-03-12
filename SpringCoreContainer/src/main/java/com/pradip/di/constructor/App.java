package com.pradip.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Constructor Dependency Injection");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConstructorDependencyInjection.xml");
		OutputHelper outputHelper=(OutputHelper)applicationContext.getBean("helperBean");
		outputHelper.callGenerateOutput();
		
	}
	
}
