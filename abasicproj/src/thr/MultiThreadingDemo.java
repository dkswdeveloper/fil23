package thr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//2 methods to create threads
//1 extends the thread class
class ChildThread extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i<=100; i++)
		{
			System.out.println("child " + i);
		}
	}
}
//2 Implement the Runnable interface
class ChildThread2 implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i<=100; i++)
		{
			System.out.println("Child2 " + i);
		}
	}
}

class Counter extends Thread
{ 	public static Map<String,Integer> map = new HashMap<>();
	String filename;
	String word;
	int count = 0;
	List<Integer> list;
	public Counter(String filename, String word) {
		super();
		this.filename = filename;
		this.word = word;
	}
	public Counter(String filename, String word, List<Integer> list) {
		super();
		this.filename = filename;
		this.word = word;
		this.list= list;
	}
	@Override
	public void run()
	{	System.out.println("Searchig in " + filename);
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{	String line = br.readLine();
			int cnt = 0;
			while(line != null)
			{
				if(line.contains(word))
					cnt++;
				line = br.readLine();
			}
			System.out.println("Found in " + filename + " " + cnt + " times");
			this.count = cnt;
			if(list!= null) list.add(cnt);
			System.out.println("putting in map " + filename + "," + count);
			map.put(filename, cnt);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
public class MultiThreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new ArrayList<>();
		Counter c1 = new Counter("src/io/FileCopyDemo.java", "System",list);
		Counter c2 = new Counter("src/io/FileInfo.java", "System",list);
		Counter c3 = new Counter("src/io/FileNumberSum.java", "System",list);
		c1.start();
		c2.start();
		c3.start();
//		Thread.sleep(2000);
//		while(c1.isAlive() || c2.isAlive() || c3.isAlive()) { } //busy waiting
//		while(c1.isAlive()|| c2.isAlive() || c3.isAlive()) { Thread.yield(); }
		c1.join(); c2.join(); c3.join(); //thread will wait for c1 to finish
		
		int sum = c1.count + c2.count + c3.count;
		System.out.println(list);
		System.out.println(Counter.map);
		System.out.println("Total number =" + sum);
		
	}

}
