package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

    @Bean
    public Emp emp(){
        return new Emp();
    }
}
