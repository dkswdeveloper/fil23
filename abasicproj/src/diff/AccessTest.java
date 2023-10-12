package diff;

import abasicproj.College;

public class AccessTest extends College {
	public static void main(String[] args) {
		College college = new College();
//		college.name = "NCAP"; 
	}
	public void someFun()
	{
		this.name = "NCAP";
	}

}
