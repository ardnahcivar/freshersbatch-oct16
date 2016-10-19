import java.util.*;

public class Person implements Comparable<Person>
{
	private int height;
	private int weight;
	
	Person(int height,int weight){
		this.height = height;
		this.weight = weight;	
	}
	public int getHeight(){
		return height;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int compareTo(Person p){
		
		if(this.getHeight() > p.getHeight())
		{
			return 1;
		}
		else if(this.getHeight() < p.getHeight()){
			return -1;
		}
		else return 0;
	}

	public static void main(String args[])
	{
		ArrayList<Person> p = new ArrayList<Person>();
		p.add(new Person(172,67));
		p.add(new Person(152,57));
		p.add(new Person(142,52));
		p.add(new Person(162,61));
		
		System.out.println("by using Comparable");
		Collections.sort(p);
		for(Person cc : p)
			System.out.println("Height is "+cc.getHeight()+" Weight is "+cc.getWeight());
		
		Collections.sort(p,new CompHt());
		
		
		
		System.out.println("Comparing by height");
		for(Person ps : p)
			System.out.println("Height is "+ps.getHeight()+" Weight is "+ps.getWeight());
		
		Collections.sort(p,new CompWt());
		System.out.println("Comparing by weight");
		for(Person ss : p)
			System.out.println("Height is "+ss.getHeight()+" Weight is "+ss.getWeight());
	}
	
}
class CompHt implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		
		if(p1.getHeight() > p2.getHeight())
		{
			return 1;
		}
		else if(p1.getHeight() < p2.getHeight()){
			return -1;
		}
		else return 0;
	}
	
}
class CompWt implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		if(p1.getWeight() > p2.getWeight())
		{
			return 1;
		}
		else if(p1.getWeight() < p2.getWeight()){
			return -1;
		}
		else return 0;
	}
}