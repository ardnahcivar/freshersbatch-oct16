import java.util.*;
import java.util.function.UnaryOperator;

public class Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("satya nadella");
		names.add("binny bansal");
		names.add("jack dorsey");
		names.add("Steve jobs");
		names.add("sundar pichai");
		names.add("bill gates");
		names.add("jeff bezos");
		
		/*UnaryOperator<String> unary = new UnaryOperator<String>() {
			
			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};*/
		
		names.replaceAll(p -> p.toUpperCase());
		for(String n : names)
			System.out.println(n);

	}

}
