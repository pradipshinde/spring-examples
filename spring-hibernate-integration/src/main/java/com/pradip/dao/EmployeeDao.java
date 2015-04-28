package com.pradip.dao;

import com.pradip.model.Employee;

/**
 * @author Pradip
 *
 */
public interface EmployeeDao {
	
	void saveEmployee(Employee employee);

    Employee findEmployeeById(int id);     

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

}
