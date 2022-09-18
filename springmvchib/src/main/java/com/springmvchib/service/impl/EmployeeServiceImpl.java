package com.springmvchib.service.impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springmvchib.beans.Employee;
import com.springmvchib.dao.EmployeeDAO;
import com.springmvchib.service.EmployeeService;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;


	@Transactional
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
	}
	@Transactional
	public Employee getEmployee(int empid) {
		return employeeDAO.getEmployee(empid);
	}
	@Transactional
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}
}
