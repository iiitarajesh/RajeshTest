package codeShef;

public class Hellooo {

	static String secureChannel(int operation, String message, String key) {
    	
    	StringBuilder strB= new StringBuilder();
    	if(message.isEmpty()){
    		return "-1";
    	}
        if(operation==1){
        	int loopSize=key.length()>message.length()?message.length():key.length();
            for(int i=0;i<loopSize;i++){
            	int x=Character.getNumericValue(key.charAt(i));
            	char c=message.charAt(x-1);
            	for(int j=0;j<x;j++){
            		strB.append(c);
            	}
            	
            }
            if(key.length()<message.length()){
            String remaining=message.substring(key.length(), message.length());
            strB.append(remaining);
            }
           
        }
    	if(operation==2){
    		int loopSize=key.length()>message.length()?message.length():key.length();
    		int x=0;
            for(int i=0;i<loopSize;i++){
            	 x=x+Character.getNumericValue(key.charAt(i));
            	char c=message.charAt(x-1);
            		strB.append(c);
            		
            }
            		 String remaining=message.substring(x, message.length());
                     strB.append(remaining);
    	}
    	
    	return strB.toString();

    }
    
	public Integer y;
	public static void main(String[] args) {
		System.out.println();
		/*for(int i=0;i<10;i++){
			System.out.println("hi");
			if(i==5){
				break;
			}
		}
		Hellooo hel = new Hellooo();
		float f= hel.math(3);
		System.out.println(f);
		int operation=2;
		String message="oppen";
		String key="12";
		System.out.println(secureChannel(operation, message, key));*/
	}
	static int math( int y){
		y/=2;
		return y;
	}
}