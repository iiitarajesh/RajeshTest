package officeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayWild {
public static void main(String[] args) {
	ArrayList<String> asl=new ArrayList<>();
	asl.add("Raj");
	asl.add("kum");
	printRawType(asl);
	printWildType(asl);
	
	Set mySet= new HashSet<String>();
	mySet=new HashSet<Integer>();
	
	System.out.println();
	
}

public static void printRawType(ArrayList myList){
	for (Object object : myList) {
		System.out.println(object);
	}
	myList.add(200);
	myList.add("50");
}
public static void printWildType(ArrayList<?> arrList){
	for (Object object : arrList) {
		System.out.println(object);
	}
	//arrList.add(300);
	//arrList.add("400");
}
}
