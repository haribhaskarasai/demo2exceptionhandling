package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Department;
import com.stg.service.DepartmentService;

@RestController
@RequestMapping(value = "dept")
public class DepartmentControlleer {
	@Autowired
	public DepartmentService departmentService;
	
	@GetMapping(value="readbyno/{alias}")
	public Department searchByDeptNo(@PathVariable ("alias") int deptNo) {
		Department departmentTemp=null;
		departmentTemp= departmentService.searchByDeptNo(deptNo);
		return departmentTemp;
	}
}
