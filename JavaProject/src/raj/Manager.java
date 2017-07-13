package raj;

import java.util.Date;

public class Manager extends Employee{
	
	public Manager(int id, String fName, String lName, int age, Double salary, Date hireDate) {
		super(id, fName, lName, age, salary, hireDate);
		bonus= 0.0;
	}

	private Double bonus;

	public Double getSalary()
	   {
	       double baseSalary = super.getSalary();
	       return baseSalary + bonus;
	    }

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	
}
