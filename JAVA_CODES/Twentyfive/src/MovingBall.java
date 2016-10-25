
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class MovingBall extends Frame implements Runnable {

		Thread t1, t2, t3,t4;
		
		int y1 = 400, y2 = 400, y3 = 400;
		boolean red = false;
		boolean blue = false;
		boolean green = false;
		boolean not = false;
		public MovingBall() {
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
			t4 = new Thread(this);
			t1.setName("red");
			t2.setName("green");
			t3.setName("blue");
			t4.setName("check");
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
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
		public synchronized void  run() {
			// TODO Auto-generated method stub
			
			while(true){
			Thread t = Thread.currentThread();
			if(t.getName().equals("red"))
			{
				if(red == false){
				y1-=2;
				repaint();
				try {
					Thread.sleep(50);
					if(y1 == 0 )
					{
						System.out.println(y1);
						red = true;
						wait();
					
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				else{
					y1+=2;
					System.out.println(y1);
					repaint();
					try {
						Thread.sleep(50);
						if(y1 == 300 )
						{
							red = false;
							wait();
							
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if(t.getName().equals("green")){
				if(green == false){
				y2-=5;
				repaint();
				try {
					Thread.sleep(100);
					if(y2 == 0 )
					{
						green = true;
						wait();
					
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
						if(y2 == 300 )
						{

							green = false;
							wait();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if(t.getName().equals("blue")){
				if(blue == false){
				y3-=8;
				repaint();
				try {
					Thread.sleep(100);
					if(y3 == 0 )
					{
						blue = true;
						wait();
					
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
						if(y3 == 300 )
						{
							blue = false;
							wait();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if(t.getName().equals("check")){
				
				if(blue == true && red == true && green == true){
					System.out.println("in check");
						notify();
				}
				/*else if(blue == false && red == false && green == false){
					notifyAll();
				}*/
				
			}
			
			
			}
			
			
			
		}

	public static void main(String[] args) {
		Frame mf = new MovingBall();
		mf.setSize(500, 500);
		mf.setVisible(true);
		MovingBall m = new MovingBall();
		
		
	}

	

}
