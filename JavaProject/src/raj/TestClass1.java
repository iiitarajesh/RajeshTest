package raj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestClass1 {
    public static void main(String args[] ) throws Exception {
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        TestClass1 tc= new TestClass1();
        String line = sc.nextLine();
        
        int P=0;
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String input=sc.nextLine();
             P=Integer.parseInt(input);
             String K[]= new String[P];
            
            for (int j=0;j<P;j++){
            	K[j]=sc.nextLine();
            }
           int output= tc.findDualNumber(K);
           System.out.println(output);
        }
        
    }
    
    public  int findDualNumber(String str[]){
    	ArrayList<Integer> arl= new ArrayList<>();
    	for(int i=0;i<str.length;i++){
    		int num=Integer.parseInt(str[i]);
    		int mid=num/2;
    		int flag=0;
    		 for(i=2;i<=mid;i++){    
    			   if(mid%i==0){    
    			   //System.out.println("Number is not prime");    
    			   flag=1;    
    			   //break;    
    			   }    
    			  }  
    		 if (flag==0){
    			 arl.add(num);
    		 }
    		
    	}
    	if(arl.size()==0 || arl.isEmpty()){
    		return -1;
    	}
    	else{
    		int prime= Collections.max(arl);
    		return prime*prime;
    	}
    	
    	//return 10;
    }
}