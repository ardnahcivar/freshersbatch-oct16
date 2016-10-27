import java.util.ArrayList;
import java.util.function.Predicate;


class Checker implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if(t > 100)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
}

public class RemoveIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(100);
			arr.add(120);
			arr.add(130);
			arr.add(140);
			arr.add(150);
			arr.add(160);
		Checker check = new Checker();
		arr.removeIf(check);
		for(Integer a : arr)
			System.out.println(a);

	}

	
	
	

}
