package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {
	public static void main(String[] args) {
		try
		{
			/*
			 * 2 kinds of files text files binary files
			 * text				binary
			 * .txt, .java, c	.exe, .png, jpg bmp 
			 * html, xml, 			doc, docx, pdf, xls
			 * 
			 * InputStream OutpuStream
			 * Reader 		Writer
			 */
//			FileInputStream fin = new FileInputStream("d:/temp/abc.txt");
			FileInputStream fin = new FileInputStream("abc.txt");
			//in current directory (project directory)
			FileOutputStream fout = new FileOutputStream("abccopy.txt");
			int ch = fin.read(); //read byte 
			while(ch != -1)
			{
				fout.write(ch);
				ch = fin.read();
				ch = fin.read();
			}
			fin.close();
			fout.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("file copied");
	}

}
