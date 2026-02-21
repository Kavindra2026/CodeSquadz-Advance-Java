package spring;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<MyCustomEvent> {

    public void onApplicationEvent(MyCustomEvent event){
        System.out.println(event.toString());
    }
}
