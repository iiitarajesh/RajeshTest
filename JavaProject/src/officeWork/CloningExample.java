package officeWork;

class MyTesting{
	int x,y;
}

class MyTesting2 implements Cloneable{
	int a,b;
	MyTesting c= new MyTesting();
	public Object clone() throws CloneNotSupportedException{
		//return super.clone();--for shallow cloning
		//below code for Deep cloning
		MyTesting2 mt2= (MyTesting2) super.clone();
		mt2.c=new MyTesting();
		return mt2;
	}
	
}
public class CloningExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyTesting2 mt=new MyTesting2();
		mt.a=10;
		mt.b=20;
		mt.c.x=30;
		mt.c.y=40;
		
		MyTesting2 mtc=(MyTesting2) mt.clone();
		mt.a=200;
		//mtc.a=100;
		//mtc.b=200;
		//mt.c.x=300;
		
		System.out.println(mt.a +" "+mt.b+ " "+ mt.c.x+ " "+mt.c.y);
		System.out.println(mtc.a +" "+mtc.b+ " "+ mtc.c.x+ " "+mtc.c.y);
	}
}
