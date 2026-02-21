package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("salary2")
	private Salary salary;
	
	public void setSalary(Salary salary) {
		this.salary = salary;
	} 
	public Salary getSalary() {
		return salary;
	}
	
	public void showSalary() {
		salary.getBasic();
		salary.getTa();
		salary.getDa();
	}
	}

