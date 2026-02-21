package spring;

public class Emp {
    private String name;
    private Salary salary;

    public void setSalary(Salary salary) {
        System.out.println("setter of emp");
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Your Name: " + name);
    }

    public void showSalary() {
        salary.getBasic();
        salary.getTa();
        salary.getDa();
    }
}