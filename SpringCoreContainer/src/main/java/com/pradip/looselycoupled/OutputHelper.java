package com.pradip.looselycoupled;

public class OutputHelper {
	
	OutputGenerator outputGenerator;

	public void setOutputGenerator(OutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
	
	public void generateOutput()
	{
		
		outputGenerator.generateOutput();
		
	}
	

}
