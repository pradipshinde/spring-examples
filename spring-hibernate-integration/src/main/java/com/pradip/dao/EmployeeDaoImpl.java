package com.pradip.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pradip.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;

		public void saveEmployee(Employee employee) {
	     sessionFactory.getCurrentSession().persist(employee);		
			
		}

		public Employee findEmployeeById(int id) {
			
			return (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
		}

		public void updateEmployee(Employee employee) {

			sessionFactory.getCurrentSession().update(employee);
		}

		public void deleteEmployee(Employee employee) {
			sessionFactory.getCurrentSession().delete(employee);
			
		}

}
