package inh;

public class StudentInhMain {
	public static void main(String[] args) {
		Person p1 = new Person("Some name", "some address");
		p1.show();
		Student s1 = new Student("stuname", "stuAdderss", 101,"cse");
		p1 = s1; //allowed 
		p1.getName();
		p1.getAddress();
//		p1.getRoll(); //With base class ref, only base class functions
		// can be accessed
		p1.show();
		
	}

}
