package java8;

public interface MyInterface {
	
	void printMethod(String name);
	
	default void log(String str){
		System.out.println(" my name in MyInterface class is "+str);
	}
}
