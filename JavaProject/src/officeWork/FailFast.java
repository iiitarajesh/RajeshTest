package officeWork;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> myMap= new ConcurrentHashMap<>();
		myMap.put(1, "Raj");
		myMap.put(2,"Kumar");
		
		Iterator it = myMap.entrySet().iterator();
		while(it.hasNext()){
			myMap.put(4, "Lok");
			Map.Entry<Integer,String> pair=(Map.Entry<Integer,String>) it.next();
			
			System.out.println(pair.getKey() + "  " +pair.getValue());
			myMap.put(3, "kk");
		}
		
		
	}
}
