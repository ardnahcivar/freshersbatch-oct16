package com.mypackage;


class MyException extends Exception{
	private String message;
	MyException(){
		
	}
	MyException(String message)
	{
		this.message = message;
	}
	
	public String toString(){
		return message;
	}
}

public class InsufficientBalance {

	private double balance;
	private double withdrawn;
	
	
	public InsufficientBalance(double balance) {
		this.balance = balance;
	}
	


	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public void getWithdrawn(double amount) {
		if(amount > balance)
		{
			System.out.println(new MyException("Insufficient balance "+ this.balance ));
		}
		else{
			System.out.println(amount+" Amount deducted from your balance");
			System.out.println("Balance in your account is "+(balance-amount));
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsufficientBalance b =new InsufficientBalance(100000);
		
		b.getWithdrawn(132322122);

	}

}
