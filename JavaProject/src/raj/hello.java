package raj;

public class hello {

	public static void main(String[] args) {
		//System.out.println("test");
		
		if("String ".trim().equals("String")){
			System.out.println("Equal");
		}else{System.out.println("Not Equal");
		}
		try{
			int x=0;
			if(x==0){
				//System.exit(1);
				System.out.println("Exit Failed");
			}
		}
		finally{
			System.out.println("Done");
		}
	}

}
