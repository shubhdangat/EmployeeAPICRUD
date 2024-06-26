package com.acts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
//	empid bigint NOT NULL auto_increment,
//	emp_name VARCHAR(50) default NULL,
//	emp_salary float default null,
//	emp_age integer default null,
//	emp_city varchar(50) default null
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empid;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "emp_salary")
	private Float empSalary;
	
	@Column(name = "emp_age")
	private int empAge;
	
	@Column(name = "emp_city")
	private String empCity;

	public Employee(Long empid, String empName, Float empSalary, int empAge, String empCity) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
		this.empCity = empCity;
	}

	public Employee() {
		
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ ", empCity=" + empCity + "]";
	}

	

}
