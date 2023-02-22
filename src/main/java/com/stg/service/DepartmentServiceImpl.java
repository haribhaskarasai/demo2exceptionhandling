package com.stg.service;

import org.springframework.stereotype.Service;

import com.stg.exception.EmployeeException;
import com.stg.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public Department readByDeptName(String deptName) throws EmployeeException {
		Department departmentTemp=null;
		if(deptName.equals("Development")) {
			departmentTemp=new Department(10,"Development");
		}else {
			throw new EmployeeException(deptName+"Does not exist");
		}
		return departmentTemp;
	}

	@Override
	public Department searchByDeptNo(int deptNo) throws EmployeeException {
		Department departmentTemp=null;
		if(deptNo==123) {
			departmentTemp=new Department(123,"Training");
		}else {
			throw new EmployeeException("Does not exist"+deptNo);
		}
		return departmentTemp;
	}

}
