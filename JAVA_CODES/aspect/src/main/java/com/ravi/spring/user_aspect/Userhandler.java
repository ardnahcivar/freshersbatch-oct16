package com.ravi.spring.user_aspect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Userhandler {

	private User user;
	private Map<String,String> map = new HashMap<String,String>();
	private ArrayList<String> country = new ArrayList<String>();
	
	public Userhandler() {
		
	}
	
	public void addUser(User user){
		
		map.put(user.getUser_name(),user.getPass_word());
	}
	
	public void checkIfLogged(User user){
		for(Map.Entry m: map.entrySet())
		{
			if(m.getKey() == user.getUser_name()){
				System.out.println("User is already logged");
			}
			else{
				System.out.println(user.getUser_name()+" got logged");
			}
		}
	}
	
	public void register(User user){
		map.put(user.getUser_name(), user.getPass_word());
	}
	
	public void logout(User user){
		map.remove(user.getUser_name());
	}
}
