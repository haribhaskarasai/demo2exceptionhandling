package com.stg.service;

import com.stg.exception.EmployeeException;


import com.stg.model.Department;
import com.stg.model.Employee;

public interface DepartmentService {
	//curd
	public abstract Department readByDeptName(String deptName) throws EmployeeException;
	public abstract Department searchByDeptNo(int deptNo) throws EmployeeException;
}
