package Stud;

import fact.Faculty;

public class Student{
	private int roll;
	private int marks;
	
	Student(int roll,int marks){
		this.roll = roll;
		this.marks = marks;
	}
	
	/*public void getMarks(){
			getStudentMarks();

	}*/
	public static void main(String args[]){
	
		Student s = new Student(1,40);
		//s.getMarks();
		Faculty f = new Faculty();
		f.getStudentMarks();
	}
}