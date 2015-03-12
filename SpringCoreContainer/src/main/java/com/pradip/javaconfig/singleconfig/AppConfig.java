package com.pradip.javaconfig.singleconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {


	
	@Bean(name="outputBean")
	public OutputGenerator printOutput()
	{
		
		return new JosnOutputGenerator();
	}
	
}
