import java.util.*;
import java.util.function.Consumer;

public class ConsBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>();
		
		words.add("satya nadella");
		words.add("binny bansal");
		words.add("jack dorsey");
		words.add("Steve jobs");
		words.add("sundar pichai");
		words.add("bill gates");
		words.add("jeff bezos");
		
		StringBuilder sb = new  StringBuilder("");
		Consumer<String> cons = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				sb.append(t);
				
			}
		};
		
		for(String word :words ){
			Character first = word.charAt(0);
			cons.accept(first.toString());
			
		}
				
				
		
		System.out.println(sb);
		
	}

}
