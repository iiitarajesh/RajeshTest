package homeProject;

public class Person implements Comparable<Person> {

	private int id;
	private String name;
	private Double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Person p) {
		int nameComp=this.name.compareTo(p.name);
		if(nameComp==0) {
	if( this.salary==p.salary) return 0 ;
	if( this.salary>p.salary) return 1 ;
	else return -1;
	}
	return nameComp;
	}

	public Person(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Person() {
	}
}
