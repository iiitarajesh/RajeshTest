package test;

public class SingletonExample {

	
	private static SingletonExample se;
	private SingletonExample(){}
	
	public static synchronized SingletonExample getInstance() {
		if(se==null){
			return new SingletonExample();
		}
		return se;
	}
}
