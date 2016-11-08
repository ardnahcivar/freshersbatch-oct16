package com.ravi.spring.user_aspect;

public class User {
	private String user_name;
	private String pass_word;
	private String country;
	
	public User(String user_name, String pass_word, String country) {
		this.user_name = user_name;
		this.pass_word = pass_word;
		this.country = country;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPass_word() {
		return pass_word;
	}

	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", pass_word=" + pass_word + ", country=" + country + "]";
	}
	
	
	
	
	

}
