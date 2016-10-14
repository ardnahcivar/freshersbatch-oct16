import java.util.*;

class Login{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String user = sc.next();
		String password = "ravichandra";
		int count = 0;
		while(count<=3)
		{
			System.out.println("Enter password");
			String pass = sc.next();
			if(user.equals(password))
			{
			System.out.println("WElCOME "+user);
			}
			else
			{
			count++;
			System.out.println("INCORRECT PASSWORD!!!!!! Please try Again");
			}
			
		}
		System.out.println(" Please Contact Admin we are terminating");
		
		
	}
	
}