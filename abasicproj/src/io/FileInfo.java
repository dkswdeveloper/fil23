package io;

import java.io.File;
import java.io.IOException;

public class FileInfo {
	public static void main(String[] args) throws IOException {
		File file = new File("."); //current directory
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		String parent = file.getParent();
		System.out.println(parent);
		String[] array = file.list();
		System.out.println(String.join(",", array));
		
		file = new File("abc2.txt");
		file = new File("c:/users/a3939/temp/hello.txt");
		file = new File("c:/temp/hello.txt");
		System.out.println(file.exists());
		System.out.println(file.length());
		if(file.exists() == false)
			file.createNewFile();
		
		/*
		 * 
		 */
		
		
	}

}
