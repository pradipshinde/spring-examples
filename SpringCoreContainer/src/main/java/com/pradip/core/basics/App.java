package com.pradip.core.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Pradip
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    	
    context = new ClassPathXmlApplicationContext("SpringCoreBasics.xml");
    HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
    helloWorld.printMessage();
    
    System.out.println("you have done with how to create bean in spring");
        
    }
}
