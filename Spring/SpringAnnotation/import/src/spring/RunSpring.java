package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class RunSpring {
    public  static void main(String[] args){

        ApplicationContext ctx  =
                new AnnotationConfigApplicationContext(SalaryConfig.class);

        Emp e = (Emp) ctx.getBean(Emp.class);


        e.getName();

        Salary e1 = ctx.getBean(Salary.class);
        e1.getBasic();
    }
}
