import java.util.*;

public class BarrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		
		ListIterator<Integer> iter = arr.listIterator();
		
		while(iter.hasNext()){
			iter.next();
		}
		System.out.println("ArrayList in reverse Order");
		while(iter.hasPrevious()){
			System.out.println(iter.previous());
		}
		
	
		
		

	}

}
