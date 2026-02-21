package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(EmpConfig.class)
public class SalaryConfig {


    @Bean
    public Salary salary(){
        return new Salary();
    }
}
