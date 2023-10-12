package intf;

import java.util.Arrays;
import java.util.Comparator;

import diff.Point;

interface Calc
{
	int sum(int a, int b);
}
public class ComparableDemo {
	
	public static void main(String[] args) {
		//Anonymous class
		Figure f = new Figure() {
			@Override
			public double area() {
				System.out.println(this.getClass());
				return 1;
			} };
		System.out.println(f.area());
		//Lambda Expression for functional interface
		//interface with only ONE abstract method
		Figure f2 = ()-> { return 1; };
		Figure f3 = ()-> 1 ;
		System.out.println(f2.area());
		System.out.println(f3.area());
		Calc cal1 = new Calc() {
			@Override
			public int sum(int a, int b) {
				return a + b;
			} };
		Calc cal2 = (a,b) -> { return a + b; };
		Calc cal3 = (a,b) -> a + b ;
		String str = "Hello";
		String str2 = "Halt";
		int[] ar = { 234,345,324,67,54,5,68,756,23,54,67};
		Arrays.sort(ar);
		String arStr = Arrays.toString(ar);
		System.out.println(ar);
		System.out.println(arStr);
		Point p1 = new Point(2, 53);
		Point p2 = new Point(12, 3);
		Point p3 = new Point(2, 53);
		Point p4 = new Point(22, 3);
		Point[] ptAr = { p1,p2,p3,p4};
		Arrays.sort(ptAr);
		Comparator<Point> comp = new  Comparator<Point> () {
			@Override
			public int compare(Point o1, Point o2) {
				return 0;
			} };
		Arrays.sort(ptAr,comp );
		System.out.println(Arrays.toString(ptAr));
		
		
		
		
		
		
		
	}
}
