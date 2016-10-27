import java.util.*;


class Nums<T extends Number>{
	T a;
	

	public Nums(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
}

public class GenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Nums> array = new ArrayList<Nums>();
		array.add(new Nums<Double>(12.3));
		array.add(new Nums<Integer>(12));
		array.add(new Nums<Double>(12.434));
		
		
		
		for(Nums s:array){
			System.out.println(s.getA());
		}
			
	
	}

}
