class Employee
{
	private int no;
	private String name;
	private double salary;
	
	public Employee(int no,String name,double salary)
	{
		this.no = no;
		this.name = name;
		this.salary = salary;
		
	}
	double calSalary()
	{
		return salary;
	}
	
	
	public static void main(String args[])
	{
			Employee emp[] = new Employee[5];
			emp[0] = new Manager(1,"abc",12000,5000);
			emp[1] = new Labour(1,"pqr",12000,5000);
			emp[2] = new Employee(1,"xyz",12000);
			emp[3] = new Manager(1,"abc",12000,5000);
			emp[4] = new Labour(1,"i am labour",12000,5000);
			
			for(int i =0;i<emp.length;i++)
			{
				double s = emp[i].calSalary();
				System.out.println("salary of "+emp[i].name+" is "+s);
			}
			
	}
}

class Manager extends Employee
{
	private double incentive;
	
	public Manager(int no,String name,double salary,double incentive)
	{
		super(no,name,salary);
		this.incentive = incentive;
	}
	
	double calSalary()
	{
			return super.calSalary()+incentive;
	}
	
	
}

class Labour extends Employee
{
	private double overtime;
	
	public Labour(int no,String name,double salary,double overtime)
	{
		super(no,name,salary);
		this.overtime = overtime;
	}
	double calSalary()
	{
		return super.calSalary()+overtime;
	}
	
}