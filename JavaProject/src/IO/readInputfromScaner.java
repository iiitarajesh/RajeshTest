package IO;

import java.util.Scanner;

public class readInputfromScaner {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String line=scan.nextLine();
	String[] values=line.split("\\s+");
	
	for (String string : values) {
		int x=Integer.parseInt(string);
		System.out.println(x);
	}
}
}
