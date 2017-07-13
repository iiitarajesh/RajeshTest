package raj;

import java.util.Arrays;
import java.util.List;

public class prac {
	//int i=90;
	public static void main(String[] args) {
		/*String strLit="Rajesh";
		String strObj=new String("Rajesh");
		System.out.println(strLit==strObj);
		ArrayList<String> arlst=null;
		
		System.out.println(arlst.size());*/
		calculateFunction();
		//printFun();
	}
	private static void printFun() {
		StringBuilder first= new StringBuilder();
		first.append("A");
		StringBuilder second=new StringBuilder();
		second.append("B");
		fun(first,second);
		System.out.println(first.append(second));

	}
	private static void fun(StringBuilder first,StringBuilder second) {
		StringBuilder local=new StringBuilder();
		local.append("C");
		first.append("D");
		second=local;
		first=second;

	}
	private static void calculateFunction(){
	 String [] names = {"Tom", "Dick", "Harry"};
	 List<String> list = Arrays.asList(names);
	list.set(0, "Sue");
	System.out.println(names[0]);
	}

}
