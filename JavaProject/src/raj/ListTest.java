package raj;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ListTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> friends= new ArrayList<>();
		friends.add(1);
		//System.out.println(friends.size());
		ArrayList<Integer> people= friends;
		people.add(2);
		friends.add(3);
		//System.out.println(people.size());
		//System.out.println(friends.size());
		Iterator it=friends.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Enumeration en=null;
				
	}

}
