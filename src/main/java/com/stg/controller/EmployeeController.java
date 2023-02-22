package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.exception.EmployeeException;
import com.stg.model.Employee;
import com.stg.service.EmployeeService;

@RestController
@RequestMapping(value = "emp")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService; // wiring==DI== has a relationship

	@GetMapping(value = "/searchbyname/{alias}")
	public Employee getEmployeeByName(@PathVariable("alias") String empName) {
		// service --> repository {Dependency Injection}
		return employeeService.readByName(empName);

	}

	@GetMapping(value = "/searchbyno/{alias}")
	public Employee getEmployeeByNo(@PathVariable("alias") int intVal) {
		// service --> repository {Dependency Injection}
		return employeeService.searchByNo(intVal);

	}
	
	  @ExceptionHandler(value=com.stg.exception.EmployeeException.class) public
	  String handleException(EmployeeException employeeException){ return
	  employeeException.getMessage();
	  
	  }
	 
}
