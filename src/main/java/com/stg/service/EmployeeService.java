package com.stg.service;

import com.stg.exception.EmployeeException;
import com.stg.model.Employee;

public interface EmployeeService {
	//curd
	public abstract Employee readByName(String empName) throws EmployeeException;
	public abstract Employee searchByNo(int empNo) throws EmployeeException;
}
