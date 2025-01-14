package com.entity;

public class Register {

	private long umbno;
	private String name;
	private String email;
	private char gender;
	private int age;
	private String upass;

	private Login log;

	public Register() {

	}

	public Register(long umbno, String name, String email, char gender, int age, String upass, Login log) {
		super();
		this.umbno = umbno;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.upass = upass;
		this.log = log;
	}

	public long getUmbno() {
		return umbno;
	}

	public void setUmbno(long umbno) {
		this.umbno = umbno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public Login getLog() {
		return log;
	}

	public void setLog(Login log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Register [umbno=" + umbno + ", name=" + name + ", email=" + email + ", gender=" + gender + ", age="
				+ age + ", upass=" + upass + ", log=" + log + "]";
	}

}
