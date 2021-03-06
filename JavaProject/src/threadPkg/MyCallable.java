package threadPkg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newFixedThreadPool(10);
		List<Future<String>> myList=new ArrayList<>();
		Callable<String> cal = new MyCallable();
		for(int i=0;i<100;i++){
			Future<String> fs= es.submit(cal);
			myList.add(fs);
		}
		for (Future<String> future : myList) {
			System.out.println(new Date() +": :" + future.get());
		}
	}

}
