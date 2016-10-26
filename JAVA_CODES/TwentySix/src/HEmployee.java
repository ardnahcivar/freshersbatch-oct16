
import java.util.*;

class Employees {

	private int id;
	private String name;
	
	
	public Employees(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	private static final boolean flag = true;
	 private static final int code = 12345;
	 

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return code;
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return flag;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id is "+this.id+"Name is "+this.name;
	}
	
	
	
	
}

public class HEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employees,String> map = new HashMap<Employees,String>();
		Employees e1 = new Employees(1, "a");
		Employees e2 = new Employees(2, "b");
		Employees e3 = new Employees(3, "c");
		Employees e4 = new Employees(4, "d");
		Employees e5 = new Employees(5, "e");
		
		map.put(e1, "first");
		map.put(e2, "second");
		map.put(e3, "third");
		map.put(e4, "fourth");
		map.put(e5, "fifth");
		
		
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println(map.get(e3));
		
		for(Map.Entry<Employees, String> mp : map.entrySet()){
			System.out.println(mp.getKey()+" "+mp.getValue());
		}

	}

}
