package spring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Emp {

    private Salary salary;
  @Autowired
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
