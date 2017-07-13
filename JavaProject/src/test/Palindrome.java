/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author IBM_ADMIN
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Long input=scan.nextLong();
		Long output=0L;
		 output=findPalindrome(++input);
		System.out.println(output);
	}
	
	private static Long findPalindrome(Long myIp){
		Long input=myIp;
		Long result=0L;
		while(myIp>0){
		int x=(int) (myIp%10);
		result=result*10+x;
		myIp=myIp/10;
	}
		while(!input.equals(result)){
			result=	findPalindrome(++input);
		}
		return result;
	}
}
