interface Sortable{
	public boolean compare(Sortable s);
	public int getId();
	public int getRad();
}

 class Employee implements Sortable{
	private int id;
	
	Employee(int id)
	{
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public boolean compare(Sortable sec ){
		
		if( this.getId() > sec.getId() )
		{
			return true;
		}
		else return false;
		
	}
 public static void sortAll(Sortable e[]){
	 for(int i = 0;i<e.length;i++)
	 {
		 for(int j = i+1;j<e.length;j++)
		 {
				boolean f = e[i].compare(e[j]);
				if(f)
				{	
					Sortable d = e[i];
					e[i] = e[j];
					e[j] = d;
					
				}	
		 }
	 }
	 
 }
 public String toString(){
	 return Integer.toString(id);
 }

	public static void main(String args[]){
		
		Sortable s[] = new Sortable[5];
		s[0] = new Employee(112);
		s[1] = new Employee(21212121);
		s[2] = new Employee(3232);
		s[3] = new Employee(41);
		s[4] = new Employee(5233);
		sortAll(s);
		
		System.out.println("sorted elem of Employee ids");
		for(int i = 0;i<s.length;i++){
			System.out.println(s[i].toString());
		}
		
		Sortable s1[] = new Sortable[5];
		s1[0] = new Circle(112121);
		s1[1] = new Circle(223);
		s1[2] = new Circle(31);
		s1[3] = new Circle(4);
		s1[4] = new Circle(51212);
		sortAll(s1);
		
		System.out.println("sorted elem of Cirlce radius");
		for(int i = 0;i<s1.length;i++){
			System.out.println(s1[i].toString());
		}
		
		
	}

	public int getRad() {
		return 0;
	}
}

class Circle implements Sortable{
	int rad;
	Circle(int rad){
		this.rad = rad;
	}
		public boolean compare(Circle sec ){
		
		if( this.rad > sec.rad )
		{
			return true;
		}
		else return false;
		
	}
		public int getRad(){
			return rad;
		}
	public String toString(){
	 return Integer.toString(rad);
 }
	
	public boolean compare(Sortable s) {
		if( this.getRad() > s.getRad() )
		{
			return true;
		}
		else return false;
	}
	
	public int getId() {
		return rad;
	}
}