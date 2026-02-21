package spring;

public class Emp {
    private String name;

    Emp() {
        System.out.println("Default");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Your Name : " + name);
    }
}