import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Runnable r1 = new  Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0;i<20;i++){
					System.out.println("Ping");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
		};
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0;i<20;i++)
				{
					System.out.println("\tPong");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r3 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
					for(int i =0;i<20;i++){
						System.out.println("\t\tTong");
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		};
		
		Callable<Integer> calle = new  Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				Integer sum = 0;
				for(int i =0;i<100;i++)
				{
					sum += i;
				}
				return sum;
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
			executor.execute(r1);
			executor.execute(r2);
			executor.execute(r3);
		
			Future<Integer> f =executor.submit(calle);
			System.out.println("Value for Callable function is "+f.get());
		
		

	}

}
