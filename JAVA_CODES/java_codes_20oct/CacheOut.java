package com.mypackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CacheOut {
	
	static  class Inn{
	
		 static private HashMap<String , String> h = new HashMap<String,String>();
		 void insert(){
			 
		 }
	}
	
	public  void put(){
		
		for(Map.Entry<String, String> ent:Inn.h.entrySet())
		{
			String key = ent.getKey();
			String val = ent.getValue();
			System.out.println("Data is:"+key+" -> Timestamp of Data is:"+val);
			
		}
	}
	public void get(){
		int ch;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Data");
		String data = sc.nextLine();
		Date d = new Date();
		Inn.h.put(data, d.toString());
		System.out.println("Do u want to continue");
		
		ch = sc.nextInt();
		}while(ch != 0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CacheOut out = new CacheOut();
		out.get();
		out.put();
		
	}

}
