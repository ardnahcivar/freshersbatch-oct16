
public class Threading implements Runnable{
	Thread t1,t2,t3;
	public Threading(){
		t1 = new  Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);
		t1.setName("a");
		t2.setName("b");
		t3.setName("c");
		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread curr = Thread.currentThread();
		if(curr.getName().equals("a"))
		{
			for(int i =0;i<10;i++){
			System.out.println("a");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		else if(curr.getName().equals("b"))
		{
			for(int i =0;i<10;i++){
			System.out.println("\t b");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}else if(curr.getName().equals("c")){
			for(;;){
				System.out.println("\t \t c");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Threading();
	}
	

}
