package Spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmpConfig {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public Emp emp(){
        return new Emp();
    }
}
