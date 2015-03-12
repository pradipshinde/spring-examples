package com.pradip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradip.dto.Student;
import com.pradip.service.api.StudentService;



@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	/*Note: @RequestBody can't be used with Get Method*/	
	
	@Autowired 
	private StudentService studentService;
	


	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getStudents(){
		List<Student> studentList = studentService.getStudentList();
		return studentList;
	}
	
	@RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable int studentId){
		return studentService.getStudentById(studentId);
	}
	
	
	@RequestMapping( method = RequestMethod.POST )
	public boolean addStudent(@RequestBody Student stud){
		return studentService.addStudent(stud);
	}
	
	@RequestMapping(value = "/{studentId}", method = RequestMethod.DELETE)
	public boolean deleteStudent(@PathVariable int studentId){
		return studentService.deleteStudentById(studentId);
	}
	
	@RequestMapping(value = "/{studentId}", method = RequestMethod.PUT)
	public boolean updateStudent(@RequestBody Student stud){
		return studentService.updateStudent(stud);
	}


}
