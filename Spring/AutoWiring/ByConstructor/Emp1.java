package spring;

public class Emp1 {
    private String name;
    private Salary salary;
    private Salary salary1;

    Emp1(Salary salary22, Salary salary14, String name) {
        this.salary = salary22;
        this.salary1 = salary14;
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void getName() {
        System.out.println("Your Name: " + name);
    }

    public void showSalary1() {
        System.out.println("via salary1");
        salary1.getBasic();
        salary1.getTa();
        salary1.getDa();
    }

    public void showSalary() {
        System.out.println("via salary");
        salary.getBasic();
        salary.getTa();
        salary.getDa();
        
        if (salary == salary1) {
            System.out.println("same object");
        }
    }
}