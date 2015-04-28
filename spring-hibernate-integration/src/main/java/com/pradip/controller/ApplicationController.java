package com.pradip.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pradip.model.Employee;
import com.pradip.service.EmployeeService;

/**
 * @author Pradip
 *
 */
public class ApplicationController {

	public static void main(String[] args) {
		System.out.println("Load the applicationContext.xml file first");
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService=(EmployeeService)context.getBean("employeeService");
		
		
		//save new record  
		Employee employee=new Employee();
		employee.setEid(12);
		employee.setEname("Akshay");
		employee.setSalary(458484);
		employeeService.saveEmployee(employee);
		
		
		/*  //Fetch the reored
		Employee employee=employeeService.findEmployeeById(6);
		System.out.println("Name : "+employee.getEname());
		*/
		
		/*  //update the reored
		Employee employee=employeeService.findEmployeeById(8);
		System.out.println("Before Update Name : "+employee.getEname());
		employee.setEname("Jivan");
		employeeService.updateEmployee(employee);
		System.out.println("After Update name : "+employeeService.findEmployeeById(8).getEname());*/
		
		/* //delete the reored
		Employee employee=new Employee();
		employee.setEid(12);
		employeeService.deleteEmployee(employee);*/

		
	
	}
}
