package coll;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionDemo {
	public static void main(String[] args) {
		
		//insert in an array at end, at middle 
		//deletion from array
		// search an array
		//concatenate array
		// array contains another array
//		Collections API : 
		List<Integer> list = new ArrayList<>(); //control + shift O
//		List<Integer> list = new LinkedList<>(); //control + shift O
//		ArrayList<Integer> list2 =new ArrayList<>(); // not good
		list.add(new Integer(34));
		list.add(34); 
		list.add(12); list.add(93); list.add(34);
		list.add(12);
		System.out.println(list);
		list.add(77); // add at end
		list.add(1, 74);
		System.out.println(list);
		list.set(0, 50);
		System.out.println(list);
		System.out.println(list.contains(77));
		System.out.println(list.subList(1, 4));
		//search the list
		System.out.println(list.indexOf(839));
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		for(int x : list)
		{
			System.out.println(x);
		}
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("elem=" +t );
				
			} });
		list.forEach(t -> System.out.println("element=" + t));
		//remove all the elements less than 40
		list.removeIf(t -> t<10); //lambda
		list.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t < 10;
			} });
		list.add(830); list.add(83); list.add(294);
		System.out.println(list);
//		for(int i = 1; i<list.size(); i++)
//		{
//			list.remove(i);
//		}
//		System.out.println(list);
//		for(int i = list.size()-1; i>0; i--)
//		{
//			if(i%2==1) list.remove(i);
//		}
//		System.out.println(list);
		int i = list.size() %2 == 0? list.size()-1: list.size() -2;
		while(i> 0)
		{
			list.remove(i);
			i -= 2;
		}
		System.out.println(list);
		//remove all alternate elements from list 
		//original 1 2 4 5 2 6 7 8 9
		//output : 1 4 2 7 9
		
		// Auto Boxing , 
//		int -> Integer 
//		Auto Unboxing
//		Integer -> int
		Integer x = 34; //34 to an object Boxing
		int y = x ; //auto unboxing 
		
		
	}

}
