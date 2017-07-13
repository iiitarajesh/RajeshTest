package test;
class A
{
    int i;
 
    public A(int i)
    {
        this.i = i;
    }

	
 
    //toString() method is not overrided in this class
    
}
 
public class Test
{
   public static void main(String[] args) 
   {
	   String s = null;
      
       System.out.println("1");
	   try{
		   System.out.println(s.toString());
	   System.out.println("2");
	   }
	   catch (NullPointerException e) {
		System.out.println("npe");
	}
	   catch(Exception ex){
		   System.out.println("ex1");
	   }
	   finally {
		System.out.println("finally block");
	}
   }
}