package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);
		
		Emp e =ctx.getBean(Emp.class);
		
		e.showSalary();

	}

}
