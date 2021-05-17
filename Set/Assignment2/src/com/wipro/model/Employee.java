package com.wipro.model;

public class Employee {
	int empId;
	String empName;
	String empEmail;
	String empGender;
	float empSalary;

	public Employee(int empId, String empName, String empEmail, String empGender, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public String getEmpGender() {
		return empGender;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee --> [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empGender="
				+ empGender + ", empSalary=" + empSalary + "]";
	}

}
