package spring;

public class Emp {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Your Name: " + name);
    }

    public void init() {
        System.out.println("Bean is Initilized");
    }

    public void destroy() {
        System.out.println("Bean will destroyed.");
    }
}