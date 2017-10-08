package com.infotech.service;

import com.infotech.entities.Employee;

public interface EmployeeService {

	public abstract void createEmployee(Employee employee);
	public abstract Employee  getEmployeebyId(int employeeId);
	public abstract void updateEmployeeById(int employeeId,Double newSal);
	public abstract void  deleteEmployeeById(Integer employeeId);
}
