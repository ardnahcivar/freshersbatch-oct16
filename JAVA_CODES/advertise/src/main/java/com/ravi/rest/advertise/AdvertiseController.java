package com.ravi.rest.advertise;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myadvertise")
public class AdvertiseController {
	
	@RequestMapping(value="/register",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> register(@RequestBody User user){
		User.allUsers.add(user);
		System.out.println("New user"+user.getUser_name()+" inserted");
		return User.allUsers;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public User login(@RequestBody User user){
		if(user.getUser_name().equals(user.getPassword())){
			System.out.println("Login Successful");
			return user;
		}
		else{
			System.out.println("Login failed");
			return user;
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.DELETE)
	public void logout(@RequestHeader("auth_token")String auth_token){
		if(auth_token.equals("auth")){
			System.out.println("USER got log out");
		}
		else{
			System.out.println("Unauthorized");
		}
		
		
	}
	
	@RequestMapping(value="/getAllCategiories",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAllCategory(){
		User.categories.add("Speakers");
		User.categories.add("Mobile");
		User.categories.add("Gaming");
		return User.categories;
		
	}
	
	@RequestMapping(value="/getActions",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getActions(){
		User.actions.add("Post Adv");
		User.actions.add("View Adv");
		User.actions.add("Post message");
		User.actions.add("View message");
		return User.actions;
	}
	
	@RequestMapping(value="/postAdv",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Advertise> postAdv(@RequestBody Advertise adv){
		User.ads.add(adv);
		System.out.println("insrted");
		return User.ads;
	}
	
	@RequestMapping(value="/getAllAdv",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Advertise> getAllAdv(){
		return User.ads;
	}
		
	@RequestMapping(value="/advertiseUpdate/{ad_name}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateAdv(@PathVariable(value="ad_name")String ad_name,@RequestBody Advertise ad){
		for(Advertise add : User.ads){
			if(add.getName().equals(ad_name))
			{
				System.out.println("add"+add.getName());
				User.ads.remove(add);
				User.ads.add(ad);
				break;
			}
		}
	
	}
	
	@RequestMapping(value="/getAllUsers",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserInfo(){
		return User.allUsers;
	}
	
	
	@RequestMapping(value="/removeAdv/{ad_name}",method=RequestMethod.DELETE)
	public void removeAdv(@PathVariable(value="ad_name")String ad_name){
		User.ads.
		User.ads.remove(ad_name);
	}
	
	

}
