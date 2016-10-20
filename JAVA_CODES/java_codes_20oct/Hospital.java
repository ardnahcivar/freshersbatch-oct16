package com.mypackage;
import java.util.Random;


public class Hospital {

	public int getRandom() throws InterruptedException{
		Random r = new Random();
		while(true){
			int n = r.nextInt(200);
			if(n > 140){
				display(n);
			}
			else {
				System.out.println(n);
				Thread.sleep(1000);
				continue;
			}
		   
		}
		
	
	}
	public void display(int n){
		System.out.println(n+" Alert..............");
		System.exit(0);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		h.getRandom();
		

		
		
		

	}

}
