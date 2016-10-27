
@FunctionalInterface
interface MyInterface{
	int operations(int a,int b);
}

public class InterOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyInterface add = new MyInterface() {
				
				@Override
				public int operations(int a, int b) {
					return a+b;
				}
			};
			
			MyInterface face = (int a,int b)->a+b;
		
			System.out.println(add.operations(4, 5));
			
			MyInterface mult = new MyInterface() {
				
				@Override
				public int operations(int a, int b) {
					// TODO Auto-generated method stub
					return a*b;
				}
			};
			
			MyInterface div = new MyInterface() {
				
				@Override
				public int operations(int a, int b) {
					// TODO Auto-generated method stub
					return a/b;
				}
			};
			
	}

}
