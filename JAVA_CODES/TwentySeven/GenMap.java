import java.util.HashMap;
import java.util.Map;

class GNums<K extends Number> {
	K a;
	

	public GNums(K a) {
		this.a = a;
	}

	public K getA() {
		return a;
	}

	public void setA(K a) {
		this.a = a;
	}
	
	

	
	
	
}

public class GenMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<GNums, String> map = new HashMap<GNums,String>();
		map.put(new GNums<Integer>(12), "adi");
		map.put(new GNums<Double>(12.34), "raj");
		map.put(new GNums<Integer>(1234), "ravi");
		
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+ " "+m.getValue());
			
		}
		
		
	}

}
