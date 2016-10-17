class Saving_Current
{
	
	public static void main(String args[])
	{
			Saving_Current s[] = new Saving_Current[5];
			s[0] = new Saving(12121.343);
			s[1]  = new Current(123.343);
			
			for(int i =0;i<s.length;i++)
			{
				double sal = s[i].cal()+s[i].cal();
				System.out.println("salary  is "+sal);
			}	
			
	}
}

class Saving extends Saving_Current{
	private double fixed_depo;
	
	Saving(double fixed_depo)
	{
		this.fixed_depo = fixed_depo;
	}
	
	double cal()
	{
		return fixed_depo;
	}
	
	
}

class Current extends Saving_Current{
	private double cash_cred;
	
	Current(double cash_cred)
	{
		this.cash_cred = cash_cred;
	}
	
	double cal()
	{
		return cash_cred;
	}
	
}