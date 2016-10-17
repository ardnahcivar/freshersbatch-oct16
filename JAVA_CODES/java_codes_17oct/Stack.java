public class Stack
{
	private int array[] = new int [10];
	private int top;

	Stack()
	{
		top = -1;
	}

	void push(int d)
	{
		if(top < 10)
		{
			top++;
			System.out.println("Elem added "+d);
			array[top] = d;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}

	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underFlow");
			return -1;
		}
		else
		{
			 return array[top--];


		}

	}
	void dispElem()
	{
		if(top > -1)
		{
			System.out.println("Contents of Stack are");
			for(int i = 0;i <= top;i++)
			{	
				System.out.println(array[i]);
			}
		}
		else
		{
			System.out.println("Stack is Empty");
		}
	}

	public static void main(String args[])
	{
		Stack s = new Stack();
		for(int i = 0;i<10;i++)
		{
			s.push(i);
		}
		s.dispElem();
		for(int i = 0;i<5;i++)
		{
			int elem = s.pop();
			System.out.println("elem , poped "+elem);
		}
		s.dispElem();

	}

}
