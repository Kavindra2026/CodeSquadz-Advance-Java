package spring;

import javax.annotation.Resource;

public class Emp {

    private Salary salary;
    @Resource(name = "salary")
    public void setSalary(Salary salary){
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }


    public void showSalary(){
        salary.getBasic();
        salary.getTa();
        salary.getDa();
    }
}
