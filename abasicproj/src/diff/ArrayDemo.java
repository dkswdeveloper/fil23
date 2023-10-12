package diff;

import java.util.Random;

public class ArrayDemo {
	public static void main(String[] args) {
		//array is also an object
//		int a[10]; //error
		int a[] = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		for(int i = 0 ;i < a.length; i++)
		{
			a[i] = new Random().nextInt(10);
//			b[i] = a[i];
//			c[i] = a[i] + b[i];
		}
		System.out.println(a);
		for(int i = 0; i<a.length; i++)
			System.out.println(a[i]);
		//for each for (let x of a) in JS
		
		for(int x : a) System.out.print(x+ ",");
		
		System.out.println(b);
		System.out.println(c);
		b = a;
		b[0] = 3838;
		System.out.println(a[0]);
		int[][] ar = new int[3][4];
		ar[0] = new int[6];
		ar[2] = new int[4];
		populate(ar); //assigns random integers to the array
		print(ar); //prints the zagged 2 D array.
		
		
	}

	private static void print(int[][] a) {
		for(int i = 0; i<a.length; i++)
		{
			for(int j =0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void populate(int[][] a) {
		for(int i = 0; i<a.length; i++)
		{
			for(int j =0; j<a[i].length; j++)
			{
				a[i][j] = new Random().nextInt(10);
			}
		}
		for(int[] oned : a)
		{
			for(int x : oned)
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	}

}
