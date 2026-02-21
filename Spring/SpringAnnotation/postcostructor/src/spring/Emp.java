package spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {
    private  String name;

    public void getName() {
        System.out.println("Your name : "+ name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("bean will initialized");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy");
    }
}
