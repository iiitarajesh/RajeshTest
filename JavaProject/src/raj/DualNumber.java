package raj;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DualNumber {
	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		  System.out.println("Enter the No. of Test Case for Dual Number");
		  int try1 = scan.nextInt();
		  System.out.println(try1);
		  
		  while (try1> 0){
			  System.out.println("Test Case " + try1);
			  try1--;
			   userinput ();
		  }
		  
		//  int user input (int)
		  
		  
		  
		
	}

	private static void userinput() {
		
		System.out.println("Enter the Number Size");
		Scanner scan = new Scanner(System.in);
		Integer multi =null;
	 int m =1;
		int size = scan.nextInt();
		int [] a = new int [size];	
		
		for (int i=0;i<=a.length-1;i++){
		
			 System.out.println("Please enter number");
		        a[i] = scan.nextInt();
		        
		       
			
			}
		List<Integer> l=new ArrayList<Integer>();
		for (int i=0;i<=a.length-1;i++){
			
			 System.out.println("number "+ a[i]);
			
			 l.add(a[i]);
			 
		  }
		
        for (int i = 0; i<l.size(); i++){
            if (!isPrime(l.get(i))){
                l.remove(l.get(i));
                
            }
        }
        
        System.out.println("the final "+ l.size() + l);
		
        
        if(l.size()<=0){
        	System.out.println("No Dual number  -1 ");
        }
        
        if(l.size()==1){
        	int selfMulti= l.get(0)*l.get(0);
        	
        	System.out.println("Number after the prime and with single value  "+ selfMulti );
        	
        }
        
        if(l.size()>1){
        	
        	  for (int i = 0; i<l.size(); i++){
                m =m * l.get(i).intValue();
                   System.out.println(" more multi " + m);
                      
                  }
        	System.out.println(" more multi " + m);
        }
        
	}

	
	public static boolean isPrime(int x){
	        boolean itIs = true;
	        for (int i = 2; i < x; i++){
	            if(x%i == 0){
	                itIs = false;  
	            }
	        }
	        return itIs;
	    }
}