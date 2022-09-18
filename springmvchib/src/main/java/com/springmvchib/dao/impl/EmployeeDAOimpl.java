package com.springmvchib.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvchib.beans.Employee;
import com.springmvchib.dao.EmployeeDAO;
@Component
public class EmployeeDAOimpl implements EmployeeDAO{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public int addEmployee(Employee employee) {
		return (int) hibernateTemplate.save(employee);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		return (Employee) hibernateTemplate.save(employee);
	}
	@Override
	public Employee getEmployee(int employeeid) {
		return (Employee) hibernateTemplate.load(Employee.class,"employeeid" );
	}

}
