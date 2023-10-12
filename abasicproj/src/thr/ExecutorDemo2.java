package thr;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Calc2 implements Callable<Integer>
{
	int x, y;
	
	public Calc2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public Integer call() throws Exception {
		return x + y;
	}
	
}
class MyParallelTask implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i<= new Random().nextInt(20); i++)
		{
			System.out.println("Downloading " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ExecutorDemo2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		for(int i = 1; i<= 10; i++)
//		{
//			new Thread(new MyParallelTask()).start();
//		}
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for(int i = 1; i<= 10; i++)
		{
			pool.submit(new MyParallelTask());
		}
		Future<Integer> fut = pool.submit(new Calc2(3,4));
		System.out.println(fut.get());
		pool.shutdown();
	}

}
