package threadPkg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
	for ( int i=0;i<100;i++){
		es.execute(new task(i));
		}
	es.shutdown();
    while (!es.isTerminated()) {
    }
    System.out.println("Finished all threads");
	}
}

final class task implements Runnable{
	private int TaskID;
	public task(int id){
		this.TaskID=id;
	}

public void run(){
	System.out.println("Taskid:" +this.TaskID+"performed by"+Thread.currentThread().getName());
	}
}

