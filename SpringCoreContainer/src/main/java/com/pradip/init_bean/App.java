package com.pradip.init_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pradip
 *
 */
public class App {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_init_bean.xml");
		College college=(College)context.getBean("collegeBean");
		System.out.println(college);
		
	
}
	
}
