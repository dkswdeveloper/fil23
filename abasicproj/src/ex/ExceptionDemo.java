package ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import inh.Student;
public class ExceptionDemo {
	public static void readFile() throws FileNotFoundException, IOException
	{
		FileReader fr;
//		try {
			fr = new FileReader("abc.txt");
			int ch;
			ch = fr.read();
			System.out.println(ch);
			fr.close();
//		} catch (Exception e) {
//			System.out.println("file out of bounds");
//			e.printStackTrace();
//		}
	}
	public static void main(String[] args) throws IOException
	{
		Scanner sc = null ;
		readFile(); //if file is not found , how will main come to know
		try
		{
			try
			{
				Student s  = null;
				int roll = s.getRoll();
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			sc = new Scanner(System.in);
			System.out.println("enter 2 ints to divide");

			int x = sc.nextInt();
			int y = sc.nextInt() ;
			int quot = x/y;
			System.out.println("quotient = " + quot);
			System.out.println("enter name (min 3 characters)");
			String name = sc.next();
			if(name.length() < 3)
			{
				RuntimeException obj = new RuntimeException("short name");
				throw obj;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Bhai zero se divide mat kar. Shoonya me pahunch jayega");
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			System.out.println("yaar integer enter kar ");
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
			System.out.println("Always runs");
		}
	}
}
