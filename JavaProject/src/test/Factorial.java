package test;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int number=scan.nextInt();
	int values=factorial(number);
	System.out.println(values);
}
private static int factorial(int number){
	int result=0;
	if(number==0 || number==1){
		result=1;
	}
	else{
		result=number*factorial(number-1);
	}
	return result;
}
}
