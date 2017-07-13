package java8;
public interface Interface2 {
	class k{
		public static void main(String[] args) {
			System.out.println("test");
		}
	}
	void printMethod(String Name);
	
	default void log(String str){
		System.out.println("Interface2 logging::"+str);
	}

}