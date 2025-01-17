package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //use to create class bean
@Scope("prototype") //prototype shows different memory with different object but by default its follow singleton which shows same memory of different objects, @Scope is class level annotation
public class Emp { 

	@Value("1")   // field level annotation & method level annotation
	private int eid;

	@Value("poorva")
	private String ename;

	@Value("45895.90")
	private double salary;

	public Emp() {

	}

	public Emp(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
