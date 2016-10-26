import java.util.*;

public class Person  {

	private int weight;
	private int height;
	private String name;
	
	public Person(int weight, int height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p[] = new Person[4];
		p[0] = new Person(51, 157, "John Snow");
		p[1] = new Person(45, 121, "Tyrion");
		p[2] = new Person(87, 189, "Hodor");
		p[3] = new Person(45, 116, "No One");
		
		Set<Person> sets = new TreeSet<Person>(new Compare());
		sets.add(p[0]);
		sets.add(p[1]);
		sets.add(p[2]);
		sets.add(p[3]);
		
		for(Person petty :sets){
			System.out.println(petty.getName()+" Height is :"+petty.getHeight()+" Weight is : "+petty.getWeight());
		}
		
		
		
		
			

	}

}

class Compare implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.getWeight() > p2.getWeight())
		{
			return 1;
		}
		else if(p1.getWeight() < p2.getWeight()){
			return -1;
		}
		else if(p1.getWeight() == p2.getWeight())
			{
			if(p1.getHeight() > p2.getHeight()){
				return 1;
			}
			else {
				return -1;
			}
		}
		return 0;
	}
	
}
