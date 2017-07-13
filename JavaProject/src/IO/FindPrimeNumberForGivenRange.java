package IO;

import java.util.Scanner;

public class FindPrimeNumberForGivenRange {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String Line = null;
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			 int from = sc.nextInt();
			 int to= sc.nextInt();
			 do{
				 if(from==1 || from==2|| from==3){
					 System.out.println(from);
					 //continue;
				 }else{
				 boolean temp=true;
				 for(int p=2;p<=Math.sqrt(from);p++){
					 if(from%p==0){
						 temp=false;
					 }
				 }
				 if(temp==true){
					 System.out.println(from);
				 }
				 }
				 from+=1;
			 }while(from!=to+1);
			 
		}
			
	}
}
