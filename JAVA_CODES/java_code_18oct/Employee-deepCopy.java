class Address{
	private String  city;
	private String street;
	private int pincode;

	
	public Address(String city, String street, int pincode) {
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	
	
	
	
}
public class Employee implements Cloneable{
	private int id;
	private String name;
	private Address add;
	
	Employee(int id ,String name,Address add)
	{
		this.id = id;
		this.name = name;
		this.add = new Address(add.getCity(),add.getStreet(),add.getPincode());
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Employee e = new Employee(id, name, add);
		return e;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee(1,"ravi",new Address("pune", "dehuroad", 412101));
		/*Address a = new Address();
		a.setCity("pune");
		a.setStreet("Vikas Nagar");
		a.setPincode(412101);
		
		Employee e = new Employee(1, "ravi", a);*/
		System.out.println(e.hashCode()+" "+e.getId()+" "+e.getName()+" "+e.add.getCity()+" "+e.add.getStreet()+" "+e.add.getPincode() );
		
		Employee e1 = (Employee)e.clone();
		
		System.out.println("e "+e.add.hashCode());
		System.out.println("e1 "+e1.add.hashCode());
		System.out.println(e1.add.hashCode()+" "+e1.getId()+" "+e1.getName()+" "+e1.add.getCity()+" "+e1.add.getStreet()+" "+e1.add.getPincode() );
		
		e.add.setCity("mumbai");
		System.out.println("-------------");
		System.out.println(e.hashCode()+" "+e.getId()+" "+e.getName()+" "+e.add.getCity()+" "+e.add.getStreet()+" "+e.add.getPincode() );
		
		System.out.println("em "+e.add.hashCode());
		System.out.println("e1m "+e1.add.hashCode());
		System.out.println(e1.hashCode()+" "+e1.getId()+" "+e1.getName()+" "+e1.add.getCity()+" "+e1.add.getStreet()+" "+e1.add.getPincode() );
		
	}
}
