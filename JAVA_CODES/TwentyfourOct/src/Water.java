
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Water extends Frame implements Runnable {

	//int y1 = 400, y2 = 400, y3 = 400;
	Thread t1,t2,t3;
	static int in = 50;
	static int out = 70;
	static int total = -1;
	
	public Water() {
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
		t1.setName("in");
		t2.setName("out");
		t3.setName("controller");
		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.start();
		
	}
		
	public void paint(Graphics g) {	
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		int val = total;
		System.out.println(val);
		g.fillRect(150, 400, 200,val);
		g.drawString("70%", 380, 200);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			Thread t = Thread.currentThread();
			if(t.getName().equals("in"))
			{
				if(total >= 0)
				{
					total = 0;
				}
				else{
					total += in;
					repaint();
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if(t.getName().equals("out")){
					if(total >= 0){
						total = 0;
					}
					else{
					total -= 70;
					repaint();
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();		
				}
					}
			}
			else if(t.getName().equals("controller")){
				if(total <= -300){
				 total = 0;	
				}			
			}
			}
		
	}

	public static void main(String[] args) {
		Frame mf = new Water();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	
}
