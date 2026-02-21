package spring;

public class Emp {
    private String name;
    private Salary salary;

    Emp(Salary salary, String name) {
        System.out.println("Via Constructor");
        this.salary = salary;
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void getName() {
        System.out.println("Your Name : " + name);
    }

    public void showSalary() {
        salary.getBasic();
        salary.getTa();
        salary.getDa();
    }
}