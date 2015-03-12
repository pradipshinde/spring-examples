package com.pradip.looselycoupled;

/**
 * @author Pradip
 *
 */
public class OutHelper {
	
	OutputGenerator generator;
	

	/**
	 * This looks more elegant, and you only need to manage a single helper class, 
	 * however the helper class is still tightly coupled to XmlOutputGenerator, 
	 * every change of output generator still involves minor code change.
	 */
	public OutHelper()
	 {
		 generator=new XmlOutputGenerator();
	 }
	
	public void generateOutputUsingHelper()
	{
		generator.generateOutput();
		
	}
	
	

}
