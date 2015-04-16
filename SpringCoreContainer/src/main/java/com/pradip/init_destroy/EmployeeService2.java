package com.pradip.init_destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author Pradip
 *
 */
public class EmployeeService2 implements DisposableBean,InitializingBean {

	public String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method is called after property setting "+message );
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is called after context is closed");
		
	}
	
	@Override
	public String toString() {
		return "Message :"+message;
	}

	

}
