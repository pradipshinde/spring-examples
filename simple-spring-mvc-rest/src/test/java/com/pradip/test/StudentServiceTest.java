package com.pradip.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pradip.dto.Student;
import com.pradip.service.api.StudentService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/appcontext-test.xml")
public class StudentServiceTest {
	
	@Autowired
	StudentService studentService;
	
	@Before
	public void initList(){
		studentService.addStudent(new Student(1, "DARA"));
		System.out.print(String.format("%s %s%n","After initial:" , studentService.getStudentList()));
	}
	
	@Test
	public void testAdd() {
		studentService.addStudent(new Student(2, "sasa"));
		System.out.print(String.format("%s %s%n","After added:" , studentService.getStudentList()));
	}
	
	@Test
	public void testUpdate(){
		studentService.updateStudent(new Student(1, "sok"));
		System.out.print(String.format("%s %s%n","After updated:" , studentService.getStudentList()));
	}
	
	@Test
	public void testDelete(){
		studentService.deleteStudentById(1);
		System.out.print(String.format("%s %s%n","After deleted:" , studentService.getStudentList()));
	}


}
