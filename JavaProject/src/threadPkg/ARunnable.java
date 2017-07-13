package threadPkg;

public class ARunnable implements Runnable {
	
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("RAJESH" +i);
		}
	}
	public static void main(String[] args) {
		/*ARunnable ar = new ARunnable();
		Thread T = new Thread(ar);
		T.start();*/
		OddRunnable or=new OddRunnable();
		EvenRunnable ev = new EvenRunnable();
		Thread odThtread= new Thread(or);
		Thread evThread= new Thread(ev);
		odThtread.start();
		evThread.start();
	}

}
