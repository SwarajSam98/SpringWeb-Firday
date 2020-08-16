package com.myapp.springweb;

public class User {
	private String uname;
	private String email;
	private String dob;
	private String city;
	public User(String uname, String email, String dob, String city) {
		super();
		this.uname = uname;
		this.email = email;
		this.dob = dob;
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", email=" + email + ", dob=" + dob + ", city=" + city + "]";
	}
	
}
