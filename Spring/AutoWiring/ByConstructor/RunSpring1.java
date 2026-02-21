package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        
        Emp1 e1 = (Emp1) context.getBean("emp");
        e1.getName();
        e1.showSalary();
        e1.showSalary1();
    }
}