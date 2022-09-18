package com.springmvchib.service;


import com.springmvchib.beans.Employee;
public interface EmployeeService {
     
    public void addEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
 
    public Employee updateEmployee(Employee employee);
}