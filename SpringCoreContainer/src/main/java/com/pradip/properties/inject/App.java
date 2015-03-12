package com.pradip.properties.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("InjectValueIntoBeanProperties.xml");
	
		System.out.println("Normal Way");
		Student student=(Student)context.getBean("helloBean");
		System.out.println(student);
		
		System.out.println("Short cut way");
		Student student1=(Student)context.getBean("helloBean1");
		System.out.println(student1);
		
		System.out.println("p schema");
		Student student2=(Student)context.getBean("helloBean2");
		System.out.println(student2);
		
	}

}
