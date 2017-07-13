package raj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> myMap= new HashMap<>();
		myMap.put("apple", "a");
		myMap.put(new String("apple"), "b");
		Set keyset=myMap.keySet();
		Iterator<String> it= keyset.iterator();
		while(it.hasNext()){
			String key=(String) it.next();
			System.out.println(key);
			System.out.println(myMap.get(key));
		}
	}

}
