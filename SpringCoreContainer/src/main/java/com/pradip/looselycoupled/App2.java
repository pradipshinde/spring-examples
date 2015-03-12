package com.pradip.looselycoupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"SpringLooselyCoupled.xml"});
		OutputHelper helper=(OutputHelper)context.getBean("helperBean");
		helper.generateOutput();
		
		
	}
}
