package spring;

import org.springframework.beans.factory.annotation.Required;

public class Emp {
private String name;
private int age;

@Required
public void setName(String name) {
	this.name = name;
	}
public void getName() {
	System.out.println("Your Name :"+name);
}

@Required
public void setAge(int age) {
	this.age=age;
}
public void getAge() {
	System.out.println("Your Age :"+ age);
}
}
