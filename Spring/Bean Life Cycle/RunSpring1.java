package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class RunSpring1 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        
        Emp e1 = (Emp) context.getBean("helloWorld");
        Emp1 e2 = (Emp1) context.getBean("helloWorld1");
        
        e1.getName();
        e2.getName();
        
        context.registerShutdownHook();
    }
}