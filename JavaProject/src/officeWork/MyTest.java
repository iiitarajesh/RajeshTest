package officeWork;

class Test{
	public Test(int i){
		System.out.println(" in test class"+i);
	}
}

public class MyTest {
	Test t= new Test(5);
	public MyTest(int i){
		t=new Test(i);
		System.out.println("in myTest class"+i);
	}
	public static void main(String[] args) {
		MyTest yMyTest= new MyTest(10);
	}
}
