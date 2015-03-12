package com.pradip.di.constructor;

public class OutputHelper {

	OutputGenerator generator;
	
	//Dependency Injection via constructor
	public OutputHelper(OutputGenerator generator)
	{
		
		this.generator=generator;
		
	}
	
	public void callGenerateOutput()
	{
		
		generator.generateOutput();
		
	}
}
