package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInputbytext {
	 static int squareCount=0;
	 static int rectangeCount=0;
	 static int noneOfThese=0;
	 
public static void main(String[] args) throws FileNotFoundException {
	
	Scanner scan=new Scanner(new File("C:\\myData.txt"));
	while(scan.hasNextLine()){
		List<Integer> myList= new ArrayList<>();
		String line=scan.nextLine();
		String[] values=line.split("\\s+");
	for (String string : values) {
		int x=Integer.parseInt(string);
			myList.add(x);
		}
	findMe(myList);
	}
	System.out.println("Square="+squareCount);	
	System.out.println("Rectangle="+rectangeCount);	
	System.out.println("NoneOfThese="+noneOfThese);	
}

static int findMe(List<Integer> myList){
	List<Integer> newList=myList;
	int i=0;
		if((newList.get(i)==newList.get(i+1))&&(newList.get(i+1)==newList.get(i+2))
				&&(newList.get(i+2)==newList.get(i+3))&& (newList.get(i+3)==newList.get(i))){
			squareCount=squareCount+1;
			return squareCount;
	} else if((newList.get(i)==newList.get(i+2))&&(newList.get(i+1)==newList.get(i+3))){
		rectangeCount=rectangeCount+1;
		return rectangeCount;
	} else{
		noneOfThese=noneOfThese+1;
		return noneOfThese;
	}
}
}
