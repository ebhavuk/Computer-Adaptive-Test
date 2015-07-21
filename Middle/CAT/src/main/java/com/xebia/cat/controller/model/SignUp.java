package com.xebia.cat.controller.model;

public class SignUp {

	private static String password;
	private static String username;

	private static String email;

	public SignUp(String username, String email, String password) {
		super();
		SignUp.username = username;
		this.email = email;
		this.password = password;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getUserame() {
		return username;
	}

	public void setUserame(String name) {
		this.username = name;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
