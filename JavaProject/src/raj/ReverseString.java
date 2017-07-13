package raj;


public class ReverseString {
	public static void main(String[] args) {
		/*String str="RAJESH";
		char ch[]=  str.toCharArray();
		char temp;
		for(int i=0, j=ch.length-1;i<(ch.length)/2;i++,j--){
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(new String(ch));*/
		
		StringBuffer sb= new StringBuffer("RAJESH");
		System.out.println(sb.reverse());
	}

}
