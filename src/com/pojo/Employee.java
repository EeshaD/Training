package com.pojo;

public class Employee {
	private int empId, salary;
	private String name;
	
	public Employee() {
		this.empId = 100;
		this.salary = 0;
		this.name = "John Doe";
	}

	public Employee(int empId, int salary, String name) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
