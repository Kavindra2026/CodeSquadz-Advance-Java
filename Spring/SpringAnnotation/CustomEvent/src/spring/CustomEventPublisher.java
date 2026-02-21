package spring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher){
        System.out.println("set publisher");
        this.publisher = publisher;
    }

    public void publish(){
        MyCustomEvent ce = new MyCustomEvent(this);
        System.out.println(" publish method");
        publisher.publishEvent(ce);
    }
}
