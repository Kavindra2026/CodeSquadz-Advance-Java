package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpring {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);

		Emp e1 = ctx.getBean(Emp.class);

		e1.setName("CodeSquadz");
		e1.getName();
	}


}
