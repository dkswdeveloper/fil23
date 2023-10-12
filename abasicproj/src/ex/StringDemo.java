package ex;

import java.io.IOException;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) throws IOException {
		
		String greet = "Hello";
		greet = greet.concat(" All");
		System.out.println(greet);
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // false
		System.out.println();
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		s1 = "this is a string to test";
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.startsWith("thi"));
		System.out.println(s1.endsWith("done"));
		System.out.println(s1.indexOf("test"));
		String sub = s1.substring(2);
		System.out.println(sub);
		sub = s1.substring(2,6); //>=2 and < 6
		System.out.println(sub);
		sub = s1.substring(2,2);
		System.out.println(sub);
		int x = 234;
		// "234"
		String str = "" + x;
		String valueOf = String.valueOf(x);
		//Control 2 + L
		int hash  = s1.hashCode();
		String numStr = "3838";
		int parseInt = Integer.parseInt(numStr);
		String replace = s1.replace('i', 'a');
		System.out.println(replace);
		// alt+shift X : java applic, run on server J
		String replaceAll = s1.replaceAll("t.", "XX");
		System.out.println(replaceAll);
		s1 = "this is java   and this is great lang. this allows us to do this and that";
		//find all indexes where "is" word came
		String word= "is";
		String[] words = s1.split("\\s+");
		String[] words2 = s1.split("[ ]+");
		for (String w : words)
		{
			System.out.println(w);
		}
		String[] ar= { "Akshay Pal", "anuRag Jain", 
				"Debarshi Mukherjee", "Ganesh Majji", 
				"Ganesh Hire", "karishMa Shaik", "KeerthiVasan" , 
				"Ravinder Daadi", "Sahana H P" };
		printAllWithMulipleChar(ar, 'a');
		String big[] = bigStrings(ar, 12); //all strings with length>=15
		
	}

	private static String[] bigStrings(String[] ar, int len) {
		String br[] = new String[ar.length];
		int i = 0;
		for(String word : ar)
		{
			if(word.length() >= len)
				br[i++] = word;
		}
		br = Arrays.copyOf(br, i);
		return br;
	}

	private static void printAllWithMulipleChar(String[] ar, char c) {
		for(String word : ar)
		{
			
			if(word.indexOf(c) != -1 && word.indexOf(c) != word.lastIndexOf(c))
					System.out.println(word);
		}
		for(int i= 0; i<ar.length; i++)
		{
			
			ar[i] = titleCaseSingleWord(ar[i]);
		}
		
	}
	private static String titleCase(String str)
	{
		String[] ar = str.split("\\s+");
		String ans= "";
		for(int i= 0; i<ar.length; i++)
		{
			ar[i] = titleCaseSingleWord(ar[i]);
			ans = ans + ar[i] + " ";
		}
		ans = ans.trim();
		String join = String.join(" ", ar);
		return ans;
		
		
	}
	private static String titleCaseSingleWord(String str)
	{
		String sub = str.substring(1);
		return Character.toUpperCase(str.charAt(0)) + sub.toLowerCase();
	}
	
}
