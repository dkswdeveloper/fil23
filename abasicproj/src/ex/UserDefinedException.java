package ex;

import javax.management.RuntimeErrorException;
class UnderflowException extends Exception
{
	
}
class MyStack 
{
	int[] a = new int[10];
	int top = -1;
	public void push(int x)
	{
		if(top == 9)
		{
			throw new RuntimeException("Overflow");
		}
		a[++top] = x;
	}
	public int pop() throws UnderflowException
	{
		if(top == -1)
		{
//			return 0;
			throw new UnderflowException();
		}
		return a[top--];
	}
	
}
public class UserDefinedException {
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(23); s.push(0); s.push(2); 
		//pop out all the elements and calculate sum
		int sum= 0;
		do
		{
			try
			{
			int x= s.pop();
			sum = sum + x;
			}
			catch(UnderflowException e)
			{
				break;
			}
			
		}while(true);
		
	}

}
