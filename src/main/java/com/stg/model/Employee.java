package com.stg.model;

public class Employee {
	private int empNo;
	private String empNmae;
	private int age;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int empNo, String empNmae, int age, float salary) {
		super();
		this.empNo = empNo;
		this.empNmae = empNmae;
		this.age = age;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpNmae() {
		return empNmae;
	}

	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
