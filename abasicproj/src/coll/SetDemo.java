package coll;
//class Figure implements Comparable<Figure>
//{
//	public double area() { return 0; }
//
//	@Override
//	public int compareTo(Figure o) {
//		if(this.area() > o.area()) return 1;
//		else if(this.area() < o.area()) return -1;
//		return 0;
//	}
//}
//class Rectangle extends Figure
//{
//	@Override
//	public int compareTo(Figure o) {
//		if(this.area() > o.area()) return 1;
//		else if(this.area() < o.area()) return -1;
//		return 0;
//	}
//}

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import diff.Point;

public class SetDemo {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>() ;
		Set<String> set = new TreeSet<>() ;
		//uses hashing obj.hashCode(); mod 16
		// { 1 , 2, 3 } = { 2,1,3} order does not matter
		// {1,2} U {2} = {1,2} 
		// no repeated elements
		System.out.println("hello".hashCode() );
		System.out.println("java".hashCode());
		System.out.println("dbms".hashCode());
		System.out.println("DBMS".hashCode());
		System.out.println("javascript".hashCode());
		System.out.println(set.add("hello"));
		System.out.println(set.add("java"));
		System.out.println(set.add("dbms"));
		System.out.println(set.add("javascript"));
		System.out.println(set.add("java"));
		System.out.println(set.add("dbms"));
		System.out.println(set.add("DBMS"));
		
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.contains("python"));
		Set<String> set2 = new HashSet<>();
		set2.add("delhi"); set2.add("mumbai");set2.add("java");
		
		set.addAll(set2);
		System.out.println(set);
//		"this is a string" ? How many different characters 
//				you used to create this string
//		this arng
		// list to array set to array
		Object[] array = set.toArray();
		String[] array2 = set.toArray(new String[1]);
		System.out.println(array2.length);
		array2[0] = "New String ";
		
		String[] names = {"ab", "cd", "xy", "ksj"};
		final List<String> asList = Arrays.asList(names);
//		asList.add("added new string to list");
		
		String line = "this is a string";
//		Character[] charArray = (Character[]) line.toCharArray();
//		List<char[]> asList2 = Arrays.asList(charArray);
//		HashSet<char[]> hashSet2 = new HashSet<>());
//		System.out.println("chars used=" + hashSet2.size());
		
		Set<Integer> seti = new TreeSet<>();
		seti.add(34); seti.add(94); seti.add(14); seti.add(16);
		System.out.println(seti);
		
		Set<Point> pts = new HashSet<>();
//		Set<Point> pts = new TreeSet<>();
		pts.add(new Point(3,4));
		pts.add(new Point(13,4));
		pts.add(new Point(3,40));
		pts.add(new Point(3,12));
		pts.add(new Point(3,4));
		pts.add(new Point(10,1));
		pts.add(new Point(1,91));
		
		System.out.println(pts);
		
		System.out.println(pts.contains(new Point(3,4)));
		
		
		
		
	}

}
