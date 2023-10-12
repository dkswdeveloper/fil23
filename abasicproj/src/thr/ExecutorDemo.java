package thr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class MyTask implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) { try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
class CounterCallable implements Callable<Integer>
{ 	
	public static Map<String,Integer> map = new HashMap<>();
	String filename;
	String word;
	int count = 0;
	List<Integer> list;
	public CounterCallable(String filename, String word) {
		super();
		this.filename = filename;
		this.word = word;
	}
	public CounterCallable(String filename, String word, List<Integer> list) {
		super();
		this.filename = filename;
		this.word = word;
		this.list= list;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("Searchig in " + filename);
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
		return count;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return 0;
	}
}

public class ExecutorDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		Executors.newCachedThreadPool(); //new threads created if not available
//		Executors.newScheduledThreadPool(10);
		//schedule it to run at some future time
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		Future<?> future = pool.submit(new MyTask());
		
		Future<Integer> future2 = pool.submit(new CounterCallable("abc.txt", "this"));
		future2.get();//wait for the thread to finish
		future2.isDone(); //true 
		
		pool.submit(new MyTask());
		pool.submit(new MyTask());
		pool.submit(new MyTask());
		pool.shutdown(); // old task to execute, no new task to take
	}

}
