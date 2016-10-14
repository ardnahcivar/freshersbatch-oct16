import java.util.*;

class Lottery{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	ArrayList<Integer> arr = new ArrayList<Integer>();
	while(arr.size()!=6)
	{
		int n = r.nextInt(50-1)+1;
		for(int i =0;i<arr.size();i++)
		{
			if(arr.get(i)== n)
			{
				break;
			}
		}
		arr.add(n);
	}

	System.out.println("please enter nos ");
	int nos[] = new int[6	];
	
	for(int i =0;i<6;i++)
	{
		nos[i] = sc.nextInt();
	}
	
	for(int j:arr)
	{
		for(int i =0;i<6;i++)
		{
			if(j == nos[i])
			{
				System.out.println("Match Found for"+nos[i]);
			}
		}
	}
	System.out.println("Lottery numbers are");
	for(int i : arr)
		System.out.println(i);
		
	
	}
	
}