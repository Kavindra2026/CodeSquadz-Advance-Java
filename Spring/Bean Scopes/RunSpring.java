package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Emp e1 = (Emp) context.getBean("helloWorld");
        Emp e2 = (Emp) context.getBean("helloWorld");
        
        e1.getName();
        e2.getName();
        
        if (e1 != e2) {
            System.out.println("Not same object");
        }
    }
}