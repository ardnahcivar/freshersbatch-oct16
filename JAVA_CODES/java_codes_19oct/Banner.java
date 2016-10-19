public class Banner{
	public static void main(String args[]) throws Exception
	{
		String name = new String("ravichandra");
		while(true)
		{
			Thread.sleep(1000);
			System.out.println(name);
			char c = name.charAt(0);
			name = name.substring(1,name.length());
			name = name + c;
		}
	}
}