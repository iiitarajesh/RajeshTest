package test;

public class Apple extends Fruit {
	public void getName(){
		System.out.println("This is Apple class");
	}
	
	public static void main(String[] args) {
		Fruit fr= new Apple();
		fr.getName();
				
		Integer a=new Integer(127);
		Integer b=new Integer(127);
		Integer c= 128;
		Integer d=128;
		if (a.equals(b)){
			System.out.println("a=b");
		}
	}
}
