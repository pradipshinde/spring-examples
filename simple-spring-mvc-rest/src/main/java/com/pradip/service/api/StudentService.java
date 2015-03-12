package com.pradip.service.api;

import java.util.List;

import com.pradip.dto.Student;



public interface StudentService {
	
		public boolean addStudent(Student stud);
		public List<Student> getStudentList();
		public Student getStudentById(int studentId);
		public boolean updateStudent(Student stud);
		public boolean deleteStudentById(int studentId);
		
	
}
