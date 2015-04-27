package com.pradip.init_bean;

/**
 * @author Pradip
 *
 */
public class College {
	
	private Student student;

	/*public College(Student student)
	{
		this.student=student;
	}
	*/

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	@Override
	public String toString() {
	return "College Student :"+student;
	}

}
