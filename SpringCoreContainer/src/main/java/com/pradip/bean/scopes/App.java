package com.pradip.bean.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pradip
 *
 */
public class App {

	/*
	 * Since the bean ‘studentBean’ is in singleton scope, the second 
	 * retrieval by ‘student2’ will display the name set by ‘student’ also, 
	 * even it’s retrieve by a new getBean() method. In singleton, only a
	 * single instance per Spring IoC container, no matter how many time you retrieve 
	 * it with getBean(), it will always return the same instance.
	 * 
	 */
	
		/*In prototype scope, you will have a new instance for each getBean()
	    method called.	
	    */
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeanScopes.xml");
		
		Student student=(Student)context.getBean("studentBean");
		
		student.setName("Pradip");
		System.out.println(student.getName());
		
		Student student2=(Student)context.getBean("studentBean");
		System.out.println(student2.getName());
		
		
	}
	
}
