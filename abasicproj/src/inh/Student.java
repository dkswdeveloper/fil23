package inh;

public class Student extends Person {
	//in person class there is no default constructor
	private int roll;
	private String branch;
	
	public Student(String name, String address, int roll, String branch) {
//		this.name = name; //not possible private
		super(name, address); //initialize the Person class portion
		//with the given data
		this.roll = roll;
		this.branch = branch;
	}
	public Student(int roll, String branch) {
		super("Default Name", "Default Address"); //but there is no such constructor
		System.out.println("Student (roll,brnach) called");
		this.roll = roll;
		this.branch = branch;
	}
	public Student() {
		super("Default Name", "Default Address");
		//you can call it only in subclass constructor
		//it must be first statmemt
		System.out.println("Student() called");
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void show()
	{
		String n = super.getName();
		String ad = super.getAddress();
		System.out.println("Student "+n + " from "+ad + " roll=" + roll + ", branch=" + branch);
	}
	
}
