package inh;

public class FigureMain {
	
	public static void main(String[] args) {
//		Figure f = new Figure();
		Figure f = new Circle(2);
		
		Rectangle r = new Rectangle(5,4);
		Circle c  = new Circle(5);
		System.out.println(f.area());
		System.out.println(r.area());
		System.out.println(c.area());
		f = c;
		System.out.println(f.area());
		double s = sum(r,c);
		s = sum(c,c);
		s= sum(f, f);
		System.out.println("sum = " + s);
		s = sum(34.5, 23);
	}
	public static double sum(Figure f1, Figure f2)
	{
		return f1.area() + f2.area();
	}
	public static double sum(double d1, double d2)
	{
		return d1 + d2;
	}
	public static double sum(double ar[])
	{
		double s=0;
		for(double x: ar) { s += x; }
		return s;
	}

}
