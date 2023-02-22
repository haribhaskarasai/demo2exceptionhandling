package com.stg.service;

import org.springframework.stereotype.Service;

import com.stg.exception.EmployeeException;

import com.stg.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee readByName(String empName) throws EmployeeException {
		Employee employeeTemp=null;
		if(empName.equals("Hello")) {
			employeeTemp=new Employee(10,"Hello",25,30000f);
			
		}
		else{
			throw new EmployeeException("Employee not found!");
		}
		return employeeTemp;
	}

	@Override
	public Employee searchByNo(int empNo) throws EmployeeException {
		
		Employee employeeTemp=null;
		if(empNo==100) {
			employeeTemp=new Employee(100,"Hellhsbo",25,30000f);
			
		}
		else{
			throw new EmployeeException("Does not found!"+empNo);
		}
		return employeeTemp;
	}

}
