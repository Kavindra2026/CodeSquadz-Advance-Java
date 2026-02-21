package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {

    public static void main(String[] args){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Emp e1 = (Emp) context.getBean("emp");

        e1.showSalary();
    }
}
