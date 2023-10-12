package coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import diff.Point;
import inh.Circle;
import inh.Figure;
import inh.Rectangle;
interface Joiner
{
	public String concatWithWord(String adder, String[] words);
}


class MyClass
{
	public void doSomething(Object ob)
	{
		Joiner joiner = (adder, words) -> { return words + adder; };
//		Joiner joiner2 = Some Reference to Method 
		
		System.out.println("object:" + ob);
	}
	public boolean testHash(Object ob)
	{
		int hash = ob.hashCode();
		if(hash %2 == 0) return false;
		return true;
	}
	public static void myStatic(Object ob)
	{
		System.out.println(ob);
	}
}
interface MyInterface
{
	public void show(Object ob);
}

public class ListObjectDemo {
	public static void print(Object ob)
	{
		System.out.println(ob);
	}
	public static void main(String[] args) {
		String[] names = { "amit", "sumit", "rajan", "ashish", "krishankant"};
		Arrays.sort(names); //using Comparable from String class compareTo
		System.out.println(Arrays.toString(names));
		class MyLenghtComparator implements Comparator<String>
		{
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		}
		Comparator<String> comp2 = ListObjectDemo::diff;
		
		Arrays.sort(names, new MyLenghtComparator());
		Comparator<String> mycomp1 = (s1,s2) -> s1.length() - s2.length();
		
		Arrays.sort(names, mycomp1);
		
		
		
		MyInterface my1 = (ob) -> System.out.println(ob);
		
		MyInterface my2 = System.out::println;
		my2.show("this is object");
		MyInterface my3 = ListObjectDemo::print ;
		List<Figure> list = new ArrayList<>();
		Rectangle r1 =new Rectangle(5,4);
		Rectangle r2 =new Rectangle(25,12);
		Circle c1 =new Circle(4);
		Circle c2 =new Circle(5);
		list.add(c1);
		list.add(r1);
		list.add(r2);
		list.add(c2);
		boolean contains = list.contains(new Rectangle(5,4));
		System.out.println(contains);
		
		list.forEach(new Consumer<Figure>() {
			@Override
			public void accept(Figure t) {
				System.out.println("Figure:"+t);
			} });
		list.forEach(t -> System.out.println(t));
		list.forEach(System.out::println);
		MyClass obj = new MyClass();
		list.removeIf(obj :: testHash);
		list.forEach(obj::doSomething);
		List<Point> l = new ArrayList<>();
		l.add(new Point(2,3));
		l.add(new Point(1,3));
		System.out.println(l.contains(new Point(1,3)));
		MyInterface my4 = MyClass::myStatic;
	}
	public static int diff(String s1, String s2)
	{
		int sum1 = 0;
		for(int i = 0; i<s1.length() ; i++)
			sum1 = sum1 + s1.charAt(i);
		int sum2 = 0;
		for(int i = 0; i<s2.length() ; i++)
			sum2 = sum2 + s2.charAt(i);
		return sum1 - sum2;
	}

}
