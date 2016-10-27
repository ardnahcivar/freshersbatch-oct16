import java.util.*;

public class HaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Satya Nadella");
		map.put(2, "Sundar Pichai");
		map.put(3, "indra Nooyi");
		map.put(4, "Padamshree Warrior");
		map.put(5, "Cyrus Mistry");
		
		StringBuilder sb = new StringBuilder();
		for(Map.Entry mp : map.entrySet())
		{
			sb.append("\n"+mp.getKey().toString()+" "+mp.getValue());
			
		}
		System.out.println(sb);
		

	}

}
