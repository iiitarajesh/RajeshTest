package codeShef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class NumberNeeded {
	
    public static int numberNeeded(String first, String second) {
		List<Character> mySet = new ArrayList<>();
		char[] char1 = first.toCharArray();
		char[] char2 = second.toCharArray();
		char[] removeChar= new char[first.length()+second.length()];
		Arrays.sort(char1);
		Arrays.sort(char2);
		mySet.size()
		String fir=String.valueOf(char1);
		String sec = String.valueOf(char2);
		System.out.println(fir+ " \n" +sec);
		for (int f = 0; f < fir.length(); f++) {
			mySet.add(fir.charAt(f));
			for (int s = 0; s < sec.length(); s++) {
				mySet.add(sec.charAt(s));
				if (fir.charAt(f) == sec.charAt(s)) {
					break;
				}else{
					removeChar[f]=fir.charAt(f);
				}
			}
		}
		if(removeChar.length>0){
		for (int k=0;k<removeChar.length;k++){
			mySet.remove(mySet.indexOf(removeChar[k]));
		}
		}
      return mySet.size();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    
    
    static int findDuplicates(String[][] matrix) {
        List<String> myList=new ArrayList<>();
        String[][] inPutMatrix=matrix;
        for(int i=0;i<inPutMatrix.length;i++){
            myList.add(inPutMatrix[i][0]);
            for(int j=i;inPutMatrix.lengthT;j++){
                myList.add(inPutMatrix[i][j]);
            }
        }
      Set<String> mySet= new HashSet<>(myList);
        return myList.size()-mySet.size();
    }
    
    
    
    
    
    static String secureChannel(int operation, String message, String key) {
    	operation=1;message="open";key="123";
    	StringBuilder strB= new StringBuilder();
        if(operation==1){
            for(int i=0;i<key.length();i++){
            	int x=Character.getNumericValue(key.charAt(i));
            	char c=message.charAt(x);
            	for(int j=0;j<=x;j++){
            		strB.append(c);
            	}
            	
            }
         
        }
		return strB.toString();

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
