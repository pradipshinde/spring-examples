package com.pradip.service;

import com.pradip.model.Employee;

/**
 * @author Pradip
 *
 */
public interface EmployeeService {

	void saveEmployee(Employee employee);

    Employee findEmployeeById(int id);     

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
