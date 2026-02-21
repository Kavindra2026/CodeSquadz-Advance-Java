package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpring {

    public  static  void  main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);

        Emp e1 = ctx.getBean(Emp.class);

        e1.setName("Appsquadz");
        e1.getName();
    }
}
