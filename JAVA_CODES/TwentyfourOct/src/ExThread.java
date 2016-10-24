public class ExThread extends Thread {

	public void run(){
		System.out.println(Thread.currentThread()+" is executing");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExThread e1 = new ExThread();
		ExThread e2 = new ExThread();
		ExThread e3 = new ExThread();
		e1.setName("first");
		e2.setName("second");
		e3.setName("third");
		e1.start();
		e2.start();
		e3.start();
		e1.run();
		e2.run();
		e3.run();
		

	}

}
