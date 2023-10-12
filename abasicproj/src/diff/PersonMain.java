package diff;

import java.io.IOException;

public class PersonMain {
	public static void main(String[] args) throws IOException {
		Person p = new Person("Arjun", 22, true);
		System.out.println(p); //diff.Person@87a87a
		System.out.println(p.toString());
		p = new Person("Ankit", 24, false);
		p = new Person("Akshaj", 23, true);
		p = null;
		System.gc(); //call the garbage collector
		//alt Left / Right
		System.out.println("enter any key to coninue");
		System.in.read();
	}

}
