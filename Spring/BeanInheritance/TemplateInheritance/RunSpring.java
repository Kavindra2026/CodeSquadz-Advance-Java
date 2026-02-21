package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    
        Salary s1 = (Salary) context.getBean("salary");
        s1.getId();
        s1.getBasic();
        s1.getTa();
        s1.getDa();
    }
}