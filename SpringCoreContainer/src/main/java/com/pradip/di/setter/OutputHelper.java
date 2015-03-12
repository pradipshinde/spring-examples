package com.pradip.di.setter;

public class OutputHelper {
	
	OutputGenerator generator;
	
	//Dependency Injection via Setter
	public void setGenerator(OutputGenerator generator) {
		this.generator = generator;
	}
	

	public void helperMethod()
	{
		generator.generateOutput();
		
	}

}
