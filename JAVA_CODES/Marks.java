class Marks{
	public static void main(String args[]){
		int m1 = Integer.parseInt(args[0]);
		int m2 = Integer.parseInt(args[1]);
		int m3 = Integer.parseInt(args[2]);
		if(m1 > 60 && m2 > 60 && m3 > 60){
			System.out.println("Passed");
		}
		else if((m1>60&&m2>60&&m3<60) ||(m1>60&&m2<60&&m3>60)||(m1<60&&m2>60&&m3>60)){
			System.out.println("Promoted");
		}
		else if((m1<60||m2<60||m3<60)|| ((m1>60&&m2<60&&m3<60) ||(m1<60&&m2>60&&m3<60)||(m1<60&&m2<60&&m3>60))){
			System.out.println("Failed");
		}

	}
	
}