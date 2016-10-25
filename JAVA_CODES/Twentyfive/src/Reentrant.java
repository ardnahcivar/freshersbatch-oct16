

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.util.concurrent.locks.ReentrantLock;
import java.awt.event.WindowAdapter;

public class Reentrant extends Frame implements Runnable {

		Thread t1, t2, t3;
		
		int y1 = 400, y2 = 400, y3 = 400;
		boolean blue = false;
		boolean green = false;
		boolean red = false;
		private final ReentrantLock lock = new ReentrantLock();
		static int count = 0;
		public Reentrant() {

			setBackground(Color.CYAN);
			setSize(500, 500);
			setVisible(true);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			t1 = new Thread(this);
			t2 = new Thread(this);
			t3 = new Thread(this);
			
		
			
			t1.setName("red");
			t2.setName("green");
			t3.setName("blue");
			t1.start();
			t2.start();
			t3.start();
			
		}
		
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(100, y1, 50, 50);
			g.setColor(Color.GREEN);
			g.fillOval(200, y2, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(300, y3, 50, 50);
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true){
			Thread t = Thread.currentThread();
			if(t.getName().equals("red"))
			{
				lock.lock();
				try{
				if(red == false){
				y1-=2;
				repaint();
				
				try {
					Thread.sleep(100);
					if(y1 == 40)
					{
						red = true;
						sync();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}else{
					y1+=2;
					repaint();
					
					try {
						Thread.sleep(100);
						if(y1 == 400)
						{
							red = false;
							sync();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				}finally{
					lock.unlock();
				}
			}
			else if(t.getName().equals("green")){
				lock.lock();
				try{
				if(green == false){
				y2-=5;
				repaint();
				try {
					Thread.sleep(100);
					if(y2 == 40)
					{
						green = true;
						sync();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				else{
					y2+=5;
					repaint();
					
					try {
						Thread.sleep(100);
						if(y2 == 400)
						{
							red = false;
							sync();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				}
				finally{
					lock.unlock();
				}
			}
			else if(t.getName().equals("blue")){
				lock.lock();
				try{
				if(blue == false){
				y3-=8;
				System.out.println(y3);
				repaint();
				try {
					Thread.sleep(100);
					if(y3 == 40)
					{
						blue = true;
						sync();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				else{
					y3+=8;
					repaint();
					
					try {
						Thread.sleep(100);
						if(y3 == 400)
						{
							red = false;
							sync();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				}finally{
					lock.unlock();
				}
			}
			}
			
			
		}
		public  void sync() throws InterruptedException{
			if(count == 2){
				notify();
				count = 0;
			}
			else{
				count++;
				wait();
			} 
			
		}

	public static void main(String[] args) {
		Frame mf = new Reentrant();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	}

	

}
