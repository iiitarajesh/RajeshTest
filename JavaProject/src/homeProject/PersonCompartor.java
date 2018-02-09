package homeProject;

import java.util.Comparator;

public class PersonCompartor {
	public static final Comparator<Person> salaryComparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getSalary()==o2.getSalary()) return 0;
			if(o1.getSalary()>o2.getSalary()) return 1;
			else return -1;
		}
	};

}
