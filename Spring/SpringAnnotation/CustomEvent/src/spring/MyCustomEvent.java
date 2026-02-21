package spring;


import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent {

    public MyCustomEvent(Object source){
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }
}
