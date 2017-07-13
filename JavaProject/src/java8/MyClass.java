package java8;

public class MyClass implements MyInterface, Interface2 {
	@Override
	public void printMethod(String name){
		System.out.println(name);
	}
	

	
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface2.super.log(str);
	}



	public static void main(String[] args) {
		MyClass mc=new MyClass();
		mc.log("kwkje");
	}

}
