package filehandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Account {
	static ArrayList<Double> d = new ArrayList<Double>();
	static ArrayList<Double> d1 = new ArrayList<Double>();
	
	public static  void creat(RandomAccessFile r,double bal) throws IOException
	{ 
		r.writeDouble(bal);
	}
	
	public static void read(RandomAccessFile r) throws IOException{
		r.seek(0);
		System.out.println("balance is ");
		while(r.getFilePointer() < r.length())
		{
			//System.out.println(r.readDouble());
			double val  = r.readDouble();
			System.out.println(val);
			if(val > 10000.0){
				d.add(val);
			}
				
		}

			

		
		
	}
	public static void greater(){
		System.out.println("Balance greate than 10000");
		for(Double dd :d)
			System.out.println(dd);
	}
	public static void del(RandomAccessFile r,double val) throws IOException
	{
		r.seek(0);
		String back = " ";
		while(r.getFilePointer()<r.length())
		{
			Double dd = r.readDouble();
			if(dd != val)
			{
				 d1.add(dd);
				
			}
			else{
				
			}
			
		}
		File temp = new File("random.txt");
		if (temp.exists()) {
		   // RandomAccessFile raf = new RandomAccessFile(temp, "rw");
		    r.setLength(0);
		}
		
		for(Double data :d1)
			r.writeDouble(data);
	
		
		
	}
	public static void update(RandomAccessFile r){
	
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile r = new RandomAccessFile("random.txt", "rw");
		r.setLength(0);
		
		creat(r,1);
		creat(r,2);
		creat(r,3);
		read(r);
	//	greater();
		del(r, 3);
		System.out.println("________________________");
		read(r);
		//update(r);
	
		
	}

}
