class Singleton
{
	private static Singleton obj;

	private Singleton()
	{

	}

	static Singleton creatObj()
	{
		if(obj == null)
		{
			obj = new Singleton();
			return obj;
		}
		else 
		{
			return obj;
		}		
		
	}
	void print()
	{
		System.out.println("Learning singleton");
	}
	public static void main(String args[])
	{
		Singleton s = Singleton.creatObj();
		s.print();
	}
}

