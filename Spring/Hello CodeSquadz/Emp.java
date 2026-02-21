package spring;

public class Emp {
    private String name;

    Emp() {
        System.out.println("Default");
    }

    public void setName(String name) {
        System.out.println("Setter");
        this.name = name;
    }

    public void getName() {
        System.out.println("Your Name : " + name);
    }
}