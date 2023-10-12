package abasicproj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//data types in java
		boolean flag = true; //false
		byte bt = 1; //one byte 
		char ch = 'A'; 
		char ch1 = 65 ; //'A' 2 byte data
		short sh = 23; // 2 byte int -32768 to 32767
		int i = 2; // -2 billino to +2 billion
		long l = 4L; // 8 byte data
		float f = 3.4f; // 4 byte data 
		double db = 2.3; //8 bytes data with double precision
		i = 130;
		bt = (byte) i ; //-128 to +127
		System.out.println("bt=" + bt);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int");
		int x = sc.nextInt();
		if(x % 2 == 0)
			System.out.println("even");
		else System.out.println("odd");
		
		float fl = (float) 4.5;
		//1 check for prime or not : write a function to check prime
		//2 print primes between two given integers
		//3 function to find sum of digits
		//4 function to reverse an integer
		//5 function to find the maximum digit in a given integer
		// e.g. input=2307, answer is 7
		//6 print the pattern
//		1
//		2 3
//		4 5 6 
//		7 8 9 10
		boolean isprime = prime(x);
		if(isprime) System.out.println("prime");
		else System.out.println("Not Prime");
		int sum = sumOfDigits(x); System.out.println("sum = " + x);
		System.out.println("revese = " + reverseNumber(x));
		System.out.println("maxDigit = " + maxDigit(x));
		
	}
	private static int sumOfDigits(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int maxDigit(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int reverseNumber(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static boolean prime(int n)
	{
		return true;
	}

}
