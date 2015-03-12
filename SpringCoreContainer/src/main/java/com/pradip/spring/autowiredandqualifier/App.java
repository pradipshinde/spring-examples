package com.pradip.spring.autowiredandqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Autowired-Qualifier.xml");
		College college=(College)context.getBean("collegeBean");
		System.out.println(college);
		
	}

}
