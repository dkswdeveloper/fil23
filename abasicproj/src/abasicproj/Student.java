package abasicproj;

import java.sql.Date;

public class Student {
	//data + methods 
	//auto execute when class loads
	int age; 
	Date dob;
	int day, month, year;
	public int getAge()
	{
		//algo to calucalte age return 
		//algo to get age from day month year
		return age; 
	}
	int roll;
	String name;
	String branch;
	College college;
	static int nextRoll = 101;
	static 
	{
		System.out.println("static data initialized");
		//connect to db
		nextRoll = 201;
	}
	//anonymous constructor, part of every constructor
	{
		this.roll = nextRoll;
		nextRoll++;
		System.out.println("Roll allocated");
	}
	public Student( String name, String branch) {
		
		this.name = name;
		this.branch = branch;
	}
	public Student(String name, String branch, College college) {
		
		this.name = name;
		this.branch = branch;
		this.college = college;
	}
	public Student(String name) {
		this.name = name;
	}
	public void show()
	{
		System.out.println(roll + "," + name + ", " + branch);
	}
	public String toString()
	{
		return "a student with " + roll + ","  +name ;
	}
	
//delete a line control D
	//copy a line down control alt down
}

//move a line alt up/down