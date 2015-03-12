package com.pradip.looselycoupled;

/**
 * @author Pradip
 *
 */
public class App {

	
	public static void main(String[] args) {
	
		// Method call it directly

		/*
		 * In this way, the problem is the “output” is  tightly coupled to JsonOutputGenerator, every change of output generator may involve code change. If this code is scattered all over of your project, 
		 * every change of the output generator will make you suffer seriously.
		 */
		
		OutputGenerator generator=new JsonOutputGenerator();
		generator.generateOutput();
		
	}
}
