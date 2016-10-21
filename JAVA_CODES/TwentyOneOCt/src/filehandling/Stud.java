package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date{
	Date d;

	public Date(Date d) {
		this.d = d;
	}
		
}


public class Stud implements Serializable {

	private int marks;
	
	
	public Stud(int marks) {	
		this.marks = marks;
	}
	


	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Stud [marks=" + marks + "]";
	}



	public static void serial() throws IOException{
		File f = new File("object_data.txt");
		FileOutputStream out = new FileOutputStream(f);
		ObjectOutputStream ob = new ObjectOutputStream(out);
		ob.writeObject(new Stud(343));
	}
	
	public static void deserial() throws IOException, ClassNotFoundException{
		File f = new File("object_data.txt");
		FileInputStream in = new FileInputStream(f);
		ObjectInputStream ob = new ObjectInputStream(in);
		Stud s = (Stud)ob.readObject();
		System.out.println(s);
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		serial();
		deserial();

	}

}
