package com.pradip.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pradip.dao.EmployeeDao;
import com.pradip.model.Employee;

/**
 * @author Pradip
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeDao;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		employeDao.saveEmployee(employee);		
	}
		
	@Transactional
	public Employee findEmployeeById(int id) {
		return employeDao.findEmployeeById(id);
	}
	
	@Transactional
	public void updateEmployee(Employee employee) {

		employeDao.updateEmployee(employee);
	}

	@Transactional
	public void deleteEmployee(Employee employee) {

		employeDao.deleteEmployee(employee);
	}
}
