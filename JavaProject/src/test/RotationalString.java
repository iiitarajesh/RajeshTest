package test;

public class RotationalString {

	public static void main(String[] args) {
		String str="AAAAD";
		isStringPalindrome(str);

	}
	private static boolean  isStringPalindrome(String str){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++){
		rotateString(ch);
		
		}
		
		return false;
	}
	private static void rotateString(char[] chr){
		char temp=chr[0];
		int x=0;
		for(x=0;x<chr.length;x++){
			chr[x]=chr[x+1];
		}
		chr[x]=temp;
	}

}
