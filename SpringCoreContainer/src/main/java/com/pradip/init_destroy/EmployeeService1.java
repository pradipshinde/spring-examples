package com.pradip.init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Pradip
 *
 */
public class EmployeeService1 {

	public String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public void initMethod()
	{
		System.out.println("Init method is called after property setting "+message );
	}
	

	public void destroyMethod()
	{
		System.out.println("Destroy method is called after context is closed");
	}
	
	@Override
	public String toString() {
		return "Message :"+message;
	}

}
