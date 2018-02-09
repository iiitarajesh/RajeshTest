package homeProject;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person(5, "rajesh", 5000.0);
		Person p1 = new Person(1, "kumar", 1000.0);
		Person p2 = new Person(3, "kumar", 4000.0);
		Person p3 = new Person(8, "kumar", 3000.0);
		Person p4 = new Person(2, "kumar", 6000.0);
		Person p5 = new Person(4, "kumar", 2000.0);
		
		ArrayList<Person> perList = new ArrayList<>();
		perList.add(p);
		perList.add(p1);perList.add(p2);
		perList.add(p3);perList.add(p4);
		perList.add(p5);
		Collections.sort(perList);
		System.out.println("sorting");
		for (Person person : perList) {
			System.out.println("id="+person.getId() +"\t salary " + person.getSalary());
		}
		
		Collections.reverse(perList);
		System.out.println("reverse order");
		for (Person person : perList) {
			System.out.println("id="+person.getId() +"\t salary " + person.getSalary());
		}
		
		Collections.sort(perList,PersonCompartor.salaryComparator);
		System.out.println("comparator sorting");
		for (Person person : perList) {
			System.out.println("id="+person.getId() +"\t salary " + person.getSalary());
		}

	}
}
