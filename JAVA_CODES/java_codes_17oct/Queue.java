public class Queue
{
	private int array[] = new int [10];
	private int top;
	static private int front;
	Queue()
	{
		top = -1;
		front = 0; 
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
			System.out.println("Queue overflow");
		}
	}

	int pop()
	{
		if(top < 0)
		{
			System.out.println("Queue underFlow");
			return -1;
		}
		else
		{
			top--;

			 return array[front++];


		}

	}
	void dispElem()
	{
		if(top > -1)
		{
			System.out.println("Contents of Queue are");
			for(int i = front;i <= top+front;i++)
			{	
				System.out.println(array[i]);
			}
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}

	public static void main(String args[])
	{
		Queue s = new Queue();
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
