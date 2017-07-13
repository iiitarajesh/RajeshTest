package threadPkg;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Counter implements Callable {
	private static final int THREAD_SIZE=10;
	public String call(){
		return Thread.currentThread().getName() + "executing....";
	}
	
	public static void main(String[] args) throws InterruptedException,ExecutionException {
		ExecutorService executer=Executors.newSingleThreadExecutor();
		Future F1= executer.submit(new Counter());
		Future F2= executer.submit(new Counter());
		System.out.println(Thread.currentThread().getName() + "executing..");
		System.out.println(F1.get());
		System.out.println(F2.get());
		
	}

}
