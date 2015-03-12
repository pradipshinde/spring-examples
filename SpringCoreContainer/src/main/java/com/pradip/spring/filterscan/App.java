package com.pradip.spring.filterscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
/**
 * @author Pradip
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
		new ClassPathXmlApplicationContext(new String[] {"SpringFilterScan.xml"});
 
    	StudentService studentService = (StudentService)context.getBean("studentService");
    	System.out.println(studentService);
 
    }
}
