package com.ravi.rest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="User")
public class User  {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int user_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="password")
	private String password;
	
//	static  List<Advertise> ads = new ArrayList<Advertise>();
	static List<String> categories = new ArrayList<String>();
	static  List<String> messages = new ArrayList<String>();
	static List<String> actions  = new ArrayList<String>();
	static List<User> allUsers  = new ArrayList<User>();
	

	public User() {
	}

	public User(String first_name, String last_name, String user_name, String password) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_name = user_name;
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addCategory(){
		categories.add("mobile");
		categories.add("tv");
		categories.add("playStation");
		categories.add("Speakers");
	}
	
	public List<String> getAllCategory(){
		return categories;
	}
	
	public void addMessage(String mess){
		messages.add(mess);
		
	}

	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", user_name=" + user_name
				+ ", password=" + password + "]";
	}

}
