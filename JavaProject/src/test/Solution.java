package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    		Map<String,String> m1= new HashMap<>();
    		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(arr.length);
        for(int j=arr.length-1;j>=0;j--){
        	System.out.println(" "+arr[j]);
        }
    }
}
