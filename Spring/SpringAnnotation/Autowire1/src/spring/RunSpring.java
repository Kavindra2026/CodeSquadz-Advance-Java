package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {

    public static void main(String[] args){

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(EmpConfig.class);

        Emp e1 = (Emp) ctx.getBean(Emp.class);

        e1.showSalary();
    }
}
