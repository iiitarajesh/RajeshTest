package singletonAndSerialization;

import java.io.Serializable;

public class SerializationExample implements Serializable {
	
	public static long serialVersionUID=7294729742134704L;
	
	private String name;
	private transient int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	protected Object readResolve() {
		return this;
	}
	
}
