public class Str{
	Str(){
		
	}
	public void  isMutable(String n){
		n.concat("it is mutable");
		System.out.println(n);
		n = n.concat("it is mutable");
		System.out.println(n);	
		
	}
	public void  isBuffMutable(StringBuffer n){
		n.append(" it is mutable");
		System.out.println(n);
		n = n.append(" it is mutable");
		System.out.println(n);	
		
	}
	
	public void  isBuildMutable(StringBuilder n){
		n.append(" it is mutable");
		System.out.println(n);
		n = n.append(" it is mutable");
		System.out.println(n);	
		
	}
	public static void main(String args[])
	{ 	
		Str n = new Str();
		String s = new String("ravichandra ");
		StringBuffer s1 = new StringBuffer("ravichandra ");
		StringBuilder s2 = new StringBuilder("ravichandra ");
		n.isMutable(s);
		n.isBuffMutable(s1);
		n.isBuildMutable(s2);	
		
		
	}
}