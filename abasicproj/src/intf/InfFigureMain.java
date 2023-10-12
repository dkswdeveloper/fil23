package intf;

import inh.Student;

public class InfFigureMain {
	public static void main(String[] args) {
		Figure f; //working as superclass
		f = new Rectangle(23, 12);
		System.out.println(f.area());
		Circle c = new Circle(2);
		f = c;
		System.out.println(f.area());
		Object ob = f;
		ob = c;
		ob = "Hello";
		ob = 23;
		ob = new Student();
		Figure[] figAr = new Figure[5];
		figAr[0] = new Rectangle(3,4);
		figAr[0] = new Circle(3);
		figAr[0] = new Rectangle(3,4);
		figAr[0] = new Rectangle(3,4);
		
		Object[] objAr = new Object[5];
		objAr[0] = "Hello";
		objAr[1] = 98;
		objAr[2] = c;
		
		
		
	}

}
