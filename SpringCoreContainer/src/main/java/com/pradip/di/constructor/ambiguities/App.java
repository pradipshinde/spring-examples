package com.pradip.di.constructor.ambiguities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		/*
		 * It’s always a good practice to explicitly declare the data type and 
		   index for each constructor argument, to avoid constructor injection type 
		   ambiguities issue.
		   note:   Spring bean can not convert of type java.lang.Integer to int 
		*/
	
	System.out.println("Constructor DI ambiguitie problem ");
	ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorAmbiguitieProblem.xml");
	Student student=(Student)context.getBean("studentBean");
	System.out.println("Student Information");
	System.out.println(student);
		
	}
	
}
