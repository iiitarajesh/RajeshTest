package raj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class TestClass3 {
    public static void main(String args[] ) throws Exception {
       
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] num=line.split(" ");
        int N=0,A=0,B=0;
        if(num.length==3){
         N=Integer.parseInt(num[0]);
         A = Integer.parseInt(num[1]);
         B=Integer.parseInt(num[2]);
        }
        Set<Integer> arl= new HashSet();
        
        for(int i=1;i<N;i++){
        	if(i%A==0){
        		arl.add(i);
        	}
        	if(i%B==0){
        		arl.add(i);
        	}
        }
        int sum=0;
        for (Integer integer : arl) {
			sum+=integer;
		}

        System.out.println(sum);
    }
}
