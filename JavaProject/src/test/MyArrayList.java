package test;

public class MyArrayList {
	private Object[] arryObj;
	private int size=0;
	
	public MyArrayList(){
		arryObj= new Object[10];
	}
	
	public Object get(int index){
		if(index<size){
			return arryObj[index];
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	

}
