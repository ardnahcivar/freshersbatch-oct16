

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Ball extends Frame implements Runnable {

		Thread t1, t2, t3;
		
		int y1 = 400, y2 = 400, y3 = 400;
		
		public Ball() {
			super("Ball game");
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
				y1-=2;
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(t.getName().equals("green")){
				y2-=5;
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(t.getName().equals("blue")){
				y3-=8;
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
			
			
		}

	public static void main(String[] args) {
		Frame mf = new Ball();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	}

	

}
