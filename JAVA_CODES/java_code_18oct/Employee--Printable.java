interface Printable{
	public void print();
}

 class Employee implements Printable{
	private int id;
	
	Employee(int id)
	{
		this.id = id;
	}
	public void print()
	{
		System.out.println("Employee id is "+id);
	}
/*	void  printall(Employee ar[],Circle c[])
	{
		print();
		
	}*/
	public static void main(String args[]){
		
		Employee e[] = new Employee[5];
		e[0] = new Employee(1);
		e[1] = new Employee(2);
		e[2] = new Employee(3);
		e[3] = new Employee(4);
		e[4] = new Employee(5);
		for(int i = 0;i<e.length;i++){
				e[i].print();
		}
		Circle c[] = new Circle[5];
		c[0] = new Circle(1);
		c[1] = new Circle(2);
		c[2] = new Circle(3);
		c[3] = new Circle(4);
		c[4] = new Circle(5);
		
		for(int i = 0;i<c.length;i++){
				c[i].print();
		}
		
	}
}

class Circle implements Printable{
	int rad;
	Circle(int rad){
		this.rad = rad;
	}
	public void print()
	{
		System.out.println("Circle radius is "+rad);
	}
}