

public class MyWrapper {
	
	Object myobj;
	

	public MyWrapper() {
		
	}
	


	public Object getMyobj() {
		return myobj;
	}



	public void setMyobj(Object myobj) {
		this.myobj = myobj;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWrapper wrap = new MyWrapper();
		wrap.setMyobj("Ravichandra");
		System.out.println(wrap.getMyobj());
		wrap.setMyobj(101);
		System.out.println(wrap.getMyobj());
	}

}
