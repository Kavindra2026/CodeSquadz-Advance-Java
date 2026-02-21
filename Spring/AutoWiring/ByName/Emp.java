package spring;

public class Emp {
    private String name;
    private Salary salary1;

    public void setSalary1(Salary salary) {
        this.salary1 = salary;
    }

    public Salary getSalary1() {
        return salary1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Your Name: " + name);
    }

    public void showSalary() {
        salary1.getBasic();
        salary1.getTa();
        salary1.getDa();
    }
}