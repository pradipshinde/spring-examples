package com.pradip.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pradip.dto.Student;

@Repository
public class StudentDao {

	private List<Student> studentList = new ArrayList<Student>();
	
	public boolean addStudent(Student stud) {
		studentList.add(stud);
		return true;
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public Student getStudentById(int studentId){
		Student result=null;
		for(Student iter : studentList){
			if(iter.getStudentId() == studentId){
				result = iter;
				break;
			}
		}
		return result;
	}
	
	
	public boolean updateStudent(Student stud) {
		boolean result = false;
		for(Student iter : studentList){
			if(iter.getStudentId() == stud.getStudentId()){
				iter.setStudentName(stud.getStudentName());
				result = true;
				break;
			}
		}
		return result;
	}
	
	public boolean deleteStudentById(int studentId) {
		boolean result = false;
		for(Student iter : studentList){
			if(iter.getStudentId() == studentId){
				studentList.remove(iter);
				result = true;
				break;
			}
		}
		return result;
	}
}

