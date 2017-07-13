package raj;

public class ClassD extends ClassC {
	public static void main(String[] args) {
		ClassB clb= new ClassB();
		String s=clb.empId;
	}
	
	@Override
	public ClassB myMethod(String srt){
		ClassB clb=new ClassB();
		return clb;
	}
	
	
}
