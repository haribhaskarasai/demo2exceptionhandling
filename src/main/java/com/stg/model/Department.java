package com.stg.model;

public class Department {
	private int deptNo;
	private String deptname;
	public Department() {
		super();
	}
	public Department(int deptNo, String deptname) {
		super();
		this.deptNo = deptNo;
		this.deptname = deptname;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	

}
