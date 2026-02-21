package spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public  static void main(String[] args){

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Emp e1 = (Emp) context.getBean("emp");


        e1.getName();
        context.registerShutdownHook();
    }
}
