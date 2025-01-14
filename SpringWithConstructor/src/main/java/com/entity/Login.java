package com.entity;

public class Login {

	private String email;
	private String lpass;

	public Login() {

	}

	public Login(String email, String lpass) {
		super();
		this.email = email;
		this.lpass = lpass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLpass() {
		return lpass;
	}

	public void setLpass(String lpass) {
		this.lpass = lpass;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + ", lpass=" + lpass + "]";
	}

}
