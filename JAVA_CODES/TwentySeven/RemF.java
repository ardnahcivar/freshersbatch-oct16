import java.util.*;
import java.util.function.Predicate;
import java.util.*;


public class RemF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("ravichandra");
		names.add("Tyrion");
		names.add("Kakashi");
		names.add("Bran");
		names.add("Katrina");
		names.add("Madara");
		names.removeIf(p -> p.length()%2==1?true:false );
		for(String val :names)
			System.out.println(val);
		
		
	}

}
