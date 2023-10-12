package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	volatile Date timeStart;
	int roll;
	String email;
	public Student(String name, int roll, String email) {
		super();
		this.name = name;
		this.roll = roll;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", email=" + email + "]";
	}
	
	
}
public class SerializeDemo {
	public static void main(String[] args) throws IOException {
		try(
			FileOutputStream fout = new FileOutputStream("mydata.bin");
			ObjectOutputStream objstream = new ObjectOutputStream(fout)
			)
		{
			objstream.writeInt(324);
			objstream.writeInt(32);
			objstream.writeDouble(3.4);
			objstream.writeObject(new Student("Anuj",283, "anuj@gmail.com"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("data written to file");
		try
		(
		FileInputStream fin = new FileInputStream("mydata.bin");
		ObjectInputStream ois =new ObjectInputStream(fin);
		)
		{
		int x = ois.readInt();
		int y = ois.readInt();
		double db = ois.readDouble();
		try {
			Object object = ois.readObject();
//			object.setStartTime(someCalculatedTime);
			System.out.println(object);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(x + "," + y + "," + db);
		}
		finally
		{
			System.out.println("done");
		}
	}

}
