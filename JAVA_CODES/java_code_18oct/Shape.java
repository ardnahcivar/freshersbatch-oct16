abstract  class Shape{
	abstract void draw();
	
	public static void main(String args[]){
		Shape s[] =  new Shape[3];
		s[0]  = new Line();
		s[1]  = new Rectangle();
		s[2]  = new Cube();
		
		for(int i = 0;i<s.length;i++){
			s[i].draw();
		}
		

	}
}

class Line extends Shape{
	void draw(){
		System.out.println("in line");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("in rect");
	}
}

class Cube extends Shape{
	void draw(){
		System.out.println("in cube");
	}
}