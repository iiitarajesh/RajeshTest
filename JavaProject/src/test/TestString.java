package test;

class Ax{
	
	Double  M1(int a,int b){
		System.out.println("M1 for class A");
		return 5d;
	}
	
	int M1(int a, int b,int c){
		
		return 4;
	}
}

class Bx extends Ax{
	Double  M1(int a,int b){
		System.out.println("M1 for class Bx");
		return 10d;
	}
	
	int M1(int a, int b,int c){
		
		return 5;
	}
}

public class TestString {
public static void main(String[] args) {
	/*String msg= new String("Hello");
	msg+="Hi";
	//msg="Raj";
*/	/*String str=new String("abcde");
	String msg="abcde";
	msg.substring(0,3);
	System.out.println(str.equals(msg));*/
	Ax a=new Bx();
System.out.println(a.M1(1, 2));
}
}
