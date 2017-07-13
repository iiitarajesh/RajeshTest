package test;

public class MyClass extends SubClass {
	static{
		int p=500;
		System.out.println(p);
	}
	{
		System.out.println("block{}");
	}
	
	public void nonStatMethod(){
		System.out.println("non Static Method");
		myStaticMethod();
	}
	
	public static void myStaticMethod(){
		System.out.println("Static Method");
	}
	
public static void main (String as[]){
	//SubClass subClass= new SubClass();
	/*System.out.println(subClass.x);
	System.out.println(y);*/
	myStaticMethod();
	new MyClass().nonStatMethod();;
}
}
