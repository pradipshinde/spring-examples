package com.pradip.init_destroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring_init_destroy_using_interface.xml");
		EmployeeService2 employee=(EmployeeService2)context.getBean("employee");
		System.out.println(employee);
		context.close();
		}
	
}
