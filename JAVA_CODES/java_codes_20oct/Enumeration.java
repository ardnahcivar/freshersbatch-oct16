package com.mypackage;


enum Status{

	NEW(1),REJECTED(2),ACCEPTD(3),COMPLETED(4);
	private int val; 
	Status(int val){
		this.val = val;
		
	}
	int getVal(){
		return val;
	}
}

public class Enumeration {
	private int oid;
	private String name;
	private int price;
	private int quantity;
	private Status s;
	
	public Enumeration(int oid, String name, int price, int quantity,Status s) {
		
		this.oid = oid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.s = s;
	}
	public String toString(){
		return "id is "+oid+" Name "+name+" Price  "+price+" Quantiity "+quantity+" Status "+s.getVal();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s = Status.ACCEPTD;
		Enumeration e = new Enumeration(1, "ravi", 232, 2,s);
		System.out.println(e);
		
	}

}
