package IO;

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n =  reader.nextInt();
        int[] tweets = new int[n];
        for(int i = 0;i<n;i++) tweets[i] = 0;
        int k = reader.nextInt();
        int count = 0;
        while(k-->0) {
            String z = reader.next();
            if (z.equals("CLICK"))
            {
                int a = reader.nextInt();
                if(tweets[a-1] == 0){
                    tweets[a-1] = 1;
                    count++;
                }else{
                    tweets[a-1] = 0;
                    count--;
                }
            }
            else{
                count = 0;
                for(int j=0;j<n;j++)tweets[j] = 0;
            };
            System.out.println(count);
        }
    }
} 