package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class FileNumberSum {
	public static void main(String[] args) {
		String fileName = "numbers.txt";
		
		
		int sum=0;
		try {
			sum = getSum(fileName);
			System.out.println("sum = " + sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String str = "12 45 \r\n\r  34\n 56 \r 34 546  32";
		sum = getSumOfString(str);
		System.out.println("sum = " + sum);
		str = "1 dfjkh 3 84 gh 4";
		
	}
	private static int getSumOfString(String str) {
		int sum = 0;
		Scanner sc = new Scanner(str);
		while(sc.hasNextInt())
		{
			int x= sc.nextInt();
			sum = sum + x;
		}
		return sum;
	}
	private static int getSum(String fileName) throws FileNotFoundException 
	{
		int sum = 0;
		FileReader fr = new FileReader(fileName);
		Scanner sc = new Scanner(fr);
		while(sc.hasNextInt())
		{
			int x= sc.nextInt();
			sum = sum + x;
		}
		return sum;
	}

}
