package com.pradip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradip.dao.StudentDao;
import com.pradip.dto.Student;
import com.pradip.service.api.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	public boolean addStudent(Student stud) {
		if(getStudentById(stud.getStudentId()) == null) {
			return studentDao.addStudent(stud);
		}
		else {
			return false;
		}
	}
	
	public List<Student> getStudentList() {
		return studentDao.getStudentList();
	}

	public Student getStudentById(int studentId){
		return studentDao.getStudentById(studentId);
	}
	
	
	public boolean updateStudent(Student stud) {
		return studentDao.updateStudent(stud);
	}
	
	public boolean deleteStudentById(int studentId) {
		return studentDao.deleteStudentById(studentId);
	}
}