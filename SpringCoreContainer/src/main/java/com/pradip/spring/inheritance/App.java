package com.pradip.spring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pradip
 *
 */
public class App {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringInheritance.xml");
		
		Student student=(Student)applicationContext.getBean("studentBean");
		System.out.println(student);
		
		/*Student student=(Student)applicationContext.getBean("studentParent");
		System.out.println(student);
	*/
	
		
	}

}
