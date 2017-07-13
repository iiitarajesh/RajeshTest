package test;

import java.util.Date;

public final class Immut {

	private final  String name;
	private final int age;
	private final Date dob;
	
	
	
	public Immut(String name, int age, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = new Date(dob.getTime());
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Date getDob() {
		return new Date(dob.getTime());
	}
	
	
	
}
