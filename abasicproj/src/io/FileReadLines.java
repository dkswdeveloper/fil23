package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadLines {
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("abc.txt");
		Scanner sc = new Scanner(fr);
		BufferedReader br =new BufferedReader(fr);
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
			line = br.readLine();
			
		}
		br.close();
		fr.close();
		
	}

}
