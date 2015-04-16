package com.pradip.init_destroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pradip
 *
 */
public class App1 {
	
	public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring_init_destroy_using_xml.xml");
	EmployeeService1 employee=(EmployeeService1)context.getBean("employee");
	System.out.println(employee);
	context.close();
	}
	
}
