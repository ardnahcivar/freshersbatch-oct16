import java.util.*;

public class Threading {

	List<Integer> nums = new ArrayList<Integer>();
	
	Threading(){
		for(int i = 0;i<100;i++){
			nums.add(i);
		}
	}
	
	public void showList(){
		for(Integer i : nums)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading t = new Threading();
		
		Runnable rbabe = ()-> t.showList();
		new Thread(rbabe).start();
	}

}
