package collectns;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetTest {
public static void main(String[] args) {
	Emp e1= new Emp(1,"rajesh",2000);
	Emp e2= new Emp(1,"rajesh",2000);
	Emp e3= new Emp(1,"rajesh",2000);
	Emp e4= e1;
	
	Map<Emp,Integer> em=new HashMap<>();
	em.put(e1, 10);
	em.put(e2, 20);
	em.put(e3, 10);
	em.put(e4, 10);
	System.out.println(em.size());

	
	String s="abc";
	String s1=new String("abc");
	String s2="abc";
	
	
	 Set<Emp> m=new HashSet<>();
	m.add(e1);
	m.add(e2);
	m.add(e3);
	m.add(e4);
	System.out.println(m.size());
	
	Set<String> ms=new HashSet<>();
	ms.add(s);
	ms.add(s1);
	ms.add(s2);
	System.out.println(ms.size());
	
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	
	
	Map<String,Integer> mm= new HashMap<>();
	mm.put(s, 10);
	mm.put(s1, 11);
	mm.put(s2, 10);
	System.out.println(mm.size());
	
	
}
}
