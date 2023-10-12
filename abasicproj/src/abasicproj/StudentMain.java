package abasicproj;

public class StudentMain {
	public static void main(String[] args) {
		int x, y, z;
		College college = new College();
		college.name="NCAP"; 
		college.city = "Gurugram";
		
		Student s1 = new Student("ab", "cse");
		Student s2 = new Student("cd", "cse");
		Student s3 = new Student("ab", "cse");
		s1.college = college;
		s2.college = college;
		s3.college = college;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
