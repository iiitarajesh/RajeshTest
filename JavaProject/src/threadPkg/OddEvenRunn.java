package threadPkg;

public class OddEvenRunn implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			
		}
		printEven();
		printOdd();
		
	}
	
	public void printOdd(){
		for(int i=0;i<10;i++){
			if(i%2!=0){
			System.out.println(i);}
		}
	}
	
	public void printEven(){
		for(int i=0;i<10;i++){
			if(i%2==0){
			System.out.println(i);}
		}
	}

}
