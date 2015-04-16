package com.pradip.init_destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author Pradip
 *
 */
public class App {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring_init_destroy.xml");
	EmployeeService employee=(EmployeeService)context.getBean("employee");
	System.out.println(employee);
	context.close();
	
}
}
