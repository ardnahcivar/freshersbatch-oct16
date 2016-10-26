import java.util.*;


class Employee{
	private String birth;
	private String name;
	
	public Employee(String birth, String name) {
		this.birth = birth;
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}


	
public class HMap {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[] = new Employee[4];
		e[0]  = new Employee("06/01/1994", "ravi");
		e[1]  = new Employee("01/01/2013", "jon");
		e[2]  = new Employee("12/06/1998", "tyrion");
		e[3]  = new Employee("06/01/1994", "no one");
		

		Map<String,String> map = new HashMap<String,String>();
		map.put(e[0].getBirth(),e[0].getName());
		map.put(e[1].getBirth(),e[1].getName());
		map.put(e[2].getBirth(),e[2].getName());
		map.put(e[3].getBirth(),e[3].getName());
			
		System.out.println(map.get(e[0].getBirth()));
		System.out.println(map.get(e[1].getBirth()));
		System.out.println(map.get(e[2].getBirth()));
		System.out.println(map.get(e[3].getBirth()));
		
		
		
	}

}

class Over extends HashMap<String, String >{

	@Override
	public String get(Object key) {
		if(this.containsKey(key)){
			return "Error";
		}
		else {
			return super.get(key);
		}
		// TODO Auto-generated method stub
		
	}
	
}
