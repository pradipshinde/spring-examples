package com.pradip.spring.filterscan;

import org.springframework.beans.factory.annotation.Autowired;
 
/**
 * @author Pradip
 *
 */
public class StudentService 
{
	@Autowired
	StudentDAO studentDAO;
 
	@Override
	public String toString() {
		return "StudentService [StudentDAO=" + studentDAO.m1() + "]";
	}
 
}