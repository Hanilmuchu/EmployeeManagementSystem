package com.hanil.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpData")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String password;
	private String email;
	private String gender;
	private long mno;
	private String desg;
	private double sal;
	private String addr;
	private String state;
	private String country;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String password, String email, String gender, long mno, String desg,
			double sal, String addr, String state, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.mno = mno;
		this.desg = desg;
		this.sal = sal;
		this.addr = addr;
		this.state = state;
		this.country = country;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", password=" + password + ", email=" + email
				+ ", gender=" + gender + ", mno=" + mno + ", desg=" + desg + ", sal=" + sal + ", addr=" + addr
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
}
