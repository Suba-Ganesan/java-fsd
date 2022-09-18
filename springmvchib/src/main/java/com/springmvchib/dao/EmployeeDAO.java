package com.springmvchib.dao;


import com.springmvchib.beans.Employee;
 
public interface EmployeeDAO {
 
    public int addEmployee(Employee employee); //add
   
    public Employee updateEmployee(Employee employee); //edit
 
    public Employee getEmployee(int employeeid); //search
}
