package officeWork;

public class ConstructorTest {
	int id;
	String name;
	float salary;
	public ConstructorTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public ConstructorTest(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}


class ChildConstuctor extends ConstructorTest{
	int childAge;

	public ChildConstuctor(int id, String name, int childAge) {
		super(id, name);
		this.childAge = childAge;
	}
	
	
}