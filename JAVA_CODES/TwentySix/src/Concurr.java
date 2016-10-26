import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		CopyOnWriteArrayList<Integer> copyArray = new CopyOnWriteArrayList<Integer>();
		copyArray.add(1);
		copyArray.add(2);
		copyArray.add(3);
		copyArray.add(4);
		copyArray.add(5);
		
		
		Iterator<Integer> iter = arr.iterator();
		
		/*
		while(iter.hasNext()){
			System.out.println(iter.next());
			arr.add(45);
		}*/
		
		Iterator<Integer> iterCopy = copyArray.iterator();
		while(iterCopy.hasNext()){
			System.out.println(iterCopy.next());
			copyArray.add(45);
		}
		
		iterCopy = copyArray.iterator();
		while(iterCopy.hasNext()){
			System.out.println(iterCopy.next());
			//copyArray.add(45);
		}
			
	}

}
