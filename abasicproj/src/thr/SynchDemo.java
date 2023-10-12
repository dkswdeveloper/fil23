package thr;
class Printer
{
//	synchronized 
	public void print(String msg) throws InterruptedException
	{
		System.out.print("["); Thread.sleep(3000);
		System.out.print(msg);
		System.out.print("]");
	}
}
class MyThread extends Thread
{
	Printer printer;
	String word;
	public MyThread(Printer printer, String word) {
		super();
		this.printer = printer;
		this.word = word;
	}
	public void run()
	{
		try {
//			synchronized(printer)
			{
				this.printer.print(word);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SynchDemo {
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		MyThread t1 = new MyThread(printer, "java");
		MyThread t2= new MyThread(printer, "dbms");
		t1.start(); t2.start();
		String str = "";
		for(char ch = 'a' ; ch<='z'; ch++)
			str = str + ch;
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(); //mutable string object
		for(char ch = 'a' ; ch<='z'; ch++)
			sb.append(ch);
		System.out.println(sb);
		
		StringBuffer sbf = new StringBuffer(); //mutable string object
		for(char ch = 'a' ; ch<='z'; ch++)
			sbf.append(ch);
		System.out.println(sb);
		
		
	}

}
