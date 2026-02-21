package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Emp e = (Emp) context.getBean("emp");
        e.getName();
        e.getSalary();
        
        Emp e1 = (Emp) context.getBean("emp1");
        e1.getName();
        e1.getSalary();
    }
}