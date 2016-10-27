


interface IOrder<T>{
	Boolean test(T t);
		
	
}
public class Order {
	private int price;
	private String status;
	
	

	public Order(int price, String status) {
		this.price = price;
		this.status = status;
	}
	
	



	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order(20000, "ACCEPTED");
	    Order o2 = new Order(1000, "REJECTED");
	    Order o3= new Order(25000, "ACCEPTED");
	    Order o4= new Order(5000000, "REJECTED");
		Order o5 = new Order(17000, "ACCEPTED");
		
		
		IOrder<Order> g = (Order o)-> o.price > 10000 ? true:false;
		System.out.println(o1.price+" "+o5.status+" "+g.test(o1));
		System.out.println(o2.price+" "+o5.status+" "+g.test(o2));
		System.out.println(o3.price+" "+o5.status+" "+g.test(o3));
		System.out.println(o4.price+" "+o5.status+" "+g.test(o4));
		System.out.println(o5.price+" "+o5.status+" "+g.test(o5));
		
	 
		
		
						
			
			
		}
	
		
	
	

}
