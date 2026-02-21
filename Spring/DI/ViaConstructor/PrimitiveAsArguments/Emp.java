package spring;

public class Emp {
    private String name;
    private int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getName() {
        System.out.println("Your Name: " + name);
    }

    public void getSalary() {
        System.out.println("Your salary: " + salary);
    }
}