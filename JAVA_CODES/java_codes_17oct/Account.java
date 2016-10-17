public class Account
{
	private int savAmt;
	
	Account()
	{
		savAmt = 0;
	}

	void deposit(float amt)
	{
		savAmt += amt;
	}

	void withDraw(float draw)
	{
		if(savAmt > draw)
		{
			savAmt -= draw;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

	void balance()
	{
		System.out.println("current balance is "+savAmt);
	}

	public static void main(String args[])
	{
		Account  ravi = new Account();
		ravi.deposit(500);
		ravi.withDraw(300);
		ravi.balance();


	}
}

