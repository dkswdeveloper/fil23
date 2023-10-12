package intf;
//stack of integer
//stack of string
//stack of point
interface MyAlgo<T>
{
	T apply();
}
class AlgoImpl implements MyAlgo<Integer>
{
	public Integer apply() { return 0; }
}

class MyStack <T>
{
	Object [] ar = new Object[10];
	int top = -1;
	public void push(T obj)
	{
		ar[++top] = obj;
	}
	public T pop()
	{
		return (T) ar[top--];
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		MyStack<Integer> stk = new MyStack<>();
		int x = 4; //default 0
		Integer y = 4; //default null
		//Integer Float Double Short Character Wrapper Classes
		
		
	}
}
