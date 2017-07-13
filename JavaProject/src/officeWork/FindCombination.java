package officeWork;

import java.util.Scanner;

public class FindCombination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str= scan.nextLine();
		String[] myStr=str.split(" ");
	combinationMethod(myStr);
		
	}
	public  static void combinationMethod(String[] inputStr) {
		int Len=inputStr.length;
		for(int i=0;i<Len;i++){
			int j=i;
			int k=i;
			while(k<Len-1){
			System.out.println(inputStr[j] +"="+ inputStr[k+1]);
			k=k+1;
			}
		}
		
	}
}
