package codeShef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SerejaVotesProblems {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String> myOutputList=new ArrayList<>();
	int testCase= Integer.parseInt(br.readLine());
	while(testCase-->0){
		int noOfInput=Integer.parseInt(br.readLine());
			String line=br.readLine();
			myOutputList.add(findSolutions(line,noOfInput));
	}
	for (String string : myOutputList) {
		System.out.println(string);
	}
}

private static String findSolutions(String line, Integer inputs) {
	// TODO Auto-generated method stub
	int sum=0;
	int N=inputs;
	String[] inputArray=line.split(" ");
	for (String string : inputArray) {
		int x=Integer.parseInt(string);
		sum=sum+x;
	}
	if(sum>99 && sum<=101 && sum - 100 < N){
		return "YES";
	}else{return "NO";}
	
}
}
