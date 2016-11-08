package com.ravi.spring.aspect;

import java.util.ArrayList;
import java.util.Vector;

public class Adder {
	private Vector<Integer> vect = new Vector<Integer>();
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public Adder(){
		
	}
	
	public void addVector(){
		for(int i =0;i<1000;i++){
			vect.addElement(i);
		}
		
		//System.out.println("Elem added in Vector"+n);
	}
	
	public void addArray(){
		for(int i = 0;i<1000;i++){
			arr.add(i);
		}
		//System.out.println("Elem added in Array"+n);
	}
	
	

}
