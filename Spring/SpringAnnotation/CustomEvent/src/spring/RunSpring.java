package spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
	public static void main(String []args){
		ConfigurableApplicationContext context=
		new ClassPathXmlApplicationContext("beans.xml");
		
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

		
		cvp.publish();
		
	}
}