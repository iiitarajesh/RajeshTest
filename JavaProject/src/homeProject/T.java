package homeProject;

public class T {
	 final static int a=10;
	public static void main(String[] args) {
		Integer i=new Integer(25);
		modifi(i);
		System.out.println(i);
		//modifi(i);
		//System.out.println(i);
		
		int value=25;
		assert value>=20 : "underWeight";
		System.out.println(value);
		
		T t = new T();
		StringBuilder sb= new StringBuilder("Rajesh");
		StringBuilder sc= new StringBuilder("Rajesh");
		System.out.println(sb.toString().equals(sc.toString()));
		String s1=new String("IBM");
		String s2=new String("IBM");
		System.out.println(s1.equals(s2));
		String s=null;
		try {
			t.finalize();
			System.out.println(s.equals(null));
		
		}
		catch(NullPointerException np) {
			System.out.println("null pointer "+np);
		} 
		catch(Exception e) {
			System.out.println("Exception" +e);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("FInally block");
		}
		
		
		
	}
	private static void modifi(Integer i) {
		i=i+1;
		
	}
}
