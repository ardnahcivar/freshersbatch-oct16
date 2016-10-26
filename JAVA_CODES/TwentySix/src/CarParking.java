import java.util.*;



class Parked_owner_det{
	private String owner_name;
	private String carModel;
	private int car_no;
	private long car_mob_no;
	private String address;
	
	
	public Parked_owner_det(String owner_name, String carModel, int car_no, long car_mob_no, String address) {
		
		this.owner_name = owner_name;
		this.carModel = carModel;
		this.car_no = car_no;
		this.car_mob_no = car_mob_no;
		this.address = address;
		
	}
	public Parked_owner_det(){
		
	}


	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}


	public String getCarModel() {
		return carModel;
	}


	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	public int getCar_no() {
		return car_no;
	}


	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}


	public long getCar_mob_no() {
		return car_mob_no;
	}


	public void setCar_mob_no(long car_mob_no) {
		this.car_mob_no = car_mob_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void insertOwner(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert owner name");
		String name = sc.nextLine();
		setOwner_name(name);
		System.out.println("set Car Model");
		String model = sc.nextLine();
		setCarModel(model);
		System.out.println("Insert car no");
		int carno = sc.nextInt();
		setCar_no(carno);
		System.out.println("enter mob no");
		long o = sc.nextLong();
		setCar_mob_no(o);
		System.out.println("enter address");
		String addr = sc.next();
		setAddress(addr);
		
		
	}
	
	
}

class Parked_CarOwnerList{
	Parked_owner_det details;
	private String location;
	
	public Parked_CarOwnerList(Parked_owner_det details, String location) {
		super();
		this.details = details;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;

	}
	public void getParkedCarDetails(){
		
	}
	
		
	
	
	
}

public class CarParking {
	static ArrayList<Parked_CarOwnerList> firstFloor = new ArrayList<Parked_CarOwnerList>();
	static ArrayList<Parked_CarOwnerList> secondFloor = new ArrayList<Parked_CarOwnerList>();
	static ArrayList<Parked_CarOwnerList> thirdFloor = new ArrayList<Parked_CarOwnerList>();
	static Map<Integer,String> parkedCarList = new HashMap<Integer,String>();
	
	Parked_CarOwnerList parked_ownerlst;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			int ch = 0;
			System.out.println("Space Available for First Floor "+(80 - firstFloor.size()));
			System.out.println("Space Available for Second Floor "+(80 - secondFloor.size()));
			System.out.println("Space Available for Third Floor "+(80 - secondFloor.size()));
			
			System.out.println("1.To park ADD owner details");
			System.out.println("2.Show parked Car No's ");
			System.out.println("3.Remove car from parking");
			
			System.out.println("Enter your response");
			ch = sc.nextInt();
			switch(ch){
			case 1:
				Parked_owner_det cp = new Parked_owner_det();
				cp.insertOwner();
				if(parkedCarList.size() < 240)
				{
				if(firstFloor.size() < 80){
					
					Parked_CarOwnerList p1 = new Parked_CarOwnerList(cp, "First Floor "+firstFloor.size());
					firstFloor.add(p1);
					parkedCarList.put(p1.details.getCar_no(),p1.getLocation());
					
					
				}
				else if(secondFloor.size() < 80){
					Parked_CarOwnerList p1 = new Parked_CarOwnerList(cp, "Second Floor "+secondFloor.size());
					secondFloor.add(p1);
					parkedCarList.put(p1.details.getCar_no(),p1.getLocation());
				}
				else if(thirdFloor.size() < 80){
					Parked_CarOwnerList p1 = new Parked_CarOwnerList(cp, "Third Floor "+thirdFloor.size());
					thirdFloor.add(p1);
					parkedCarList.put(p1.details.getCar_no(),p1.getLocation());
				}
				else{
					System.out.println("No Space Available");
					
				}
						
			}
				break;
				
			case 2:
					for(Map.Entry mp : parkedCarList.entrySet()){
						System.out.println("Car No "+mp.getKey()+" Parked At "+mp.getValue());
					}
					break;
					
			case 3:
					System.out.println("enter the car no  to remove");
					int no = sc.nextInt();
					System.out.println("enter the car location");
					System.out.println("if first floor press 1");
					System.out.println("if second floor press 2");
					System.out.println("if third floor press 3");
					int loc = sc.nextInt();
					switch(loc){
					case 1:
							parkedCarList.remove(no);
							//firstFloor.remove(no);
							break;
					case 2:
							//secondFloor.remove(no);
							break;
					case 3:
							thirdFloor.remove(no);
							break;
							
					default:
							System.out.println("your car has not been Parked........\n Please Check once Again");
							
					}
					
					
					
					
			}
			
			
			System.out.println("Do you want to continue.... press 1 for YES, 0 for  NO");
			choice = sc.nextInt();
			
		}
		while(choice != 0);
	}

}
