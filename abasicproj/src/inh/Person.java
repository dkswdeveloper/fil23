package inh;

public class Person {
	private String name;
	private String address;
	
//	public Person() {
//		System.out.println("Person() called");
//	}
	public Person(String name, String address) {
		System.out.println("Person(name, address) called");
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	public void show()
	{
		System.out.println("Person:" + name + ", address:" + address);
	}

}

//alt shift s : construtor o, getter setter r, tostring s
