import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProdConsPred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Integer> val = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return new Random().nextInt(200);
			}
		};
		System.out.println(val.get());
		
		Consumer<String > con = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		con.accept("ravichandra");
		
		Predicate<String> pred = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				if(t.length() > 5){
					return true;
				}
				else{
					return false;
				}
					
			}			
		};
		String names[] = {"ravichandra","jon snow","tyrion"};
	//	Iterable<String> checkNames  = Iterables.filter(names,test);
		
	}
	

}
