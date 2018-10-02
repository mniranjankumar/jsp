package com.iter.impl;

public class Employee {
	private String empNo;
	private String empName;
	private String empCity;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empNo, String empName, String empCity) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empCity = empCity;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

}
