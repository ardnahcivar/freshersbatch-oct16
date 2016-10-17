class Date
{
	int day;
	int month;
	int year;
	Date()
	{
	}
	Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	void setDate()
	{
		
	}
	void printDate()
	{
		System.out.println("Date is "+day+" "+month+" "+year+" ");
	}
	static void swapDate(Date d1,Date d2)
	{
		Date temp = new Date();
		temp.day = d1.day;
		temp.month = d1.month;
		temp.year = d1.year;

		d1.day = d2.day;
		d1.month = d2.month;
		d1.year = d2.year;

		d2.day = temp.day;
		d2.month = temp.month;
		d2.year = temp.year;

	}

	public static void main(String args[])	
	{
		Date d1 = new Date(12,12,2012);
		Date d2 = new Date(16,16,2016);
		d1.printDate();
		d2.printDate();
		System.out.println("after swap");
		swapDate(d1,d2);
		d1.printDate();
		d2.printDate();
		
	}

}
