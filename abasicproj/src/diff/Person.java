package diff;

public class Person {
	private String name;
	private int age;
	boolean member = false;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
	}
	public Person(String name, int age, boolean member) {
		super();
		this.name = name;
		this.age = age;
		this.member = member;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public Person older(Person p2)
	{
		if(this.age > p2.age)return this;
		return p2;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", member=" + member + "]";
	}
	public void finalize()
	{
		String name = "Amodita";
		System.out.println("object with name:" + name + " is collected by GC");
		System.out.println("object with name:" + this.name + " is collected by GC");
	}

}
