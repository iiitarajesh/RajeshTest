package fromIntelIdea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IBM_ADMIN on 12/28/2016.
 */
public class AndOperationProblems {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /*String testCase=br.readLine();
        String inputString=br.readLine();
       String[] inputArray=inputString.split(" ");
        String[] store= new String[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            int x=Integer.parseInt(inputArray[i]);
            String bin=Integer.toBinaryString(x);
            store[i]=bin;
        }
        int binLen=0;
        for (String str:store) {
            if(str.length()>binLen){
                binLen=str.length();
            }
            System.out.println(str);
        }

        System.out.println(binLen);*/
        System.out.println(2&3);
    }
}
