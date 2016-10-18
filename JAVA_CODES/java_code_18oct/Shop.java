import java.util.*;
public class Shop{
	
	static ArrayList<String> food = new ArrayList<String>();
	
	public static void main(String args[]){
		Dessert d[] = new Dessert[10];
		//ArrayList<Candy> ca[] = new ArrayList<Candy>();
		Scanner sc = new Scanner(System.in);
		int finalchoice;
		do{
				System.out.println("are u cust or owner .....  0. for Owner 1. for Customer ");
				int res = sc.nextInt();
		
		switch(res)
		{	
			case 0:
					int fc = 1;
					do{
					System.out.println("enter the food items");
					String n = sc.next();
					food.add(n);
					System.out.println("to add more  press 1 ,else 0");
					fc = sc.nextInt();
					System.out.println(" ");
					}while(fc != 0);
					
					break;
			case 1:
					int choice;
					int count =0;
					System.out.println("menu is");
					for(String name : food)
						System.out.println((count++)+"."+name);
					System.out.println("enter no to buy");
					choice = sc.nextInt();
					switch(choice){
						case 0:
								d[0] = new Candy();
								d[0].getCandy();
								d[0].getcost();
								break;
						/*case 1: d[1] = new Cookie();
								d[1].getCookie();
								d[1].getcost();
								break;
						case 2:
								d[2] = new Icecream();
								d[2].getIcecream();
								d[2].getcost();
								break;*/
					}
							
					System.out.println();
					
		}
		System.out.println("do u want to continue if yes press 0 ,else 1");
		finalchoice = sc.nextInt();
		}while(finalchoice !=1 );
		
	}
	
}


abstract class Dessert{
		abstract double getCandy();
		abstract double getCookie();
		abstract double getIcecream();
		abstract double getcost();
}

class Candy extends Dessert{
		double cost_dollar;
		
		double getCandy(){
			System.out.println("amt is 100");
			cost_dollar = 100;
			return cost_dollar;
		}	
		double getcost(){
			return cost_dollar;
		}
		
		
}

class Cookie extends Dessert{
	double cost_euro;
		
		double getCookie(){
			System.out.println("amt is 200");
			cost_euro = 200;
			return cost_euro;
		}	
		double getcost(){
			return cost_euro;
		}
}

class Icecream extends Dessert{
	double cost_rupee;
		
		double getIcecream(){
			System.out.println("amt is 200");
			cost_rupee = 400;
			return cost_rupee;
		}	
		double getcost(){
			return cost_rupee;
		}
	
}
/*
abstract class Person{
	abstract void addItems();
	abstract void placeOrder();
}

class Owner extends Person{
	String food[] = new String[5]; 
	void addItems(){
			for(int i = 0;i<food.length;i++){
				
			}
	}
}

class Customer extends Person{
	void placeOrder(){
		
	}
}*/