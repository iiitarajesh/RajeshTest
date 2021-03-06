package codeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class braceproblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		String[] inputString = new String[testCase];
		for (int i = 0; i < testCase; i++) {
			inputString[i] = scan.next();
		}
		//String output[] = braces(inputString);
		String output[] = solveBraceUsingStack(inputString);
		for (String string : output) {
			System.out.println(string);
		}

	}

	static String[] braces(String[] values) {
		int openBrace = 0, closeBrace = 0;
		String[] output = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length(); j++) {
				if (values[i].charAt(j) == '[' || values[i].charAt(j) == '{' || values[i].charAt(j) == '(') {
					openBrace++;
				}

				if (values[i].charAt(j) == ']' || values[i].charAt(j) == '}' || values[i].charAt(j) == ')') {
					closeBrace++;
				}
			}
			if (openBrace == closeBrace) {
				output[i] = "Yes";
			} else {
				output[i] = "No";
			}
		}
		return output;
	}
	
	static String[] solveBraceUsingStack(String[] values) {
		String[] output = new String[values.length];
		ArrayList<Character> charList= new ArrayList<>();
		for (int j=0;j<values.length;j++) {
			char[] inChar=values[j].toCharArray();
			for (int i = 0; i < inChar.length; i++) {
				if(inChar[i]=='[' || inChar[i]=='{' || inChar[i]=='('){
					charList.add(inChar[i]);
				}
				
				else if(inChar[i]==']' ){
					charList.remove((Character)'[');
				}
				else if(inChar[i]=='}' ){
					charList.remove((Character)'{');
				}
				else if(inChar[i]==')' ){
					charList.remove((Character)')');
				}
			}
			if(charList.isEmpty()){
				output[j]="Yes";
			}else{
				output[j]="No";
			}
		}
		
		return output;
	}
	
}
