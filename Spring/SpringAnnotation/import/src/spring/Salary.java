package spring;

public class Salary {
    private int basic = 2000;

    public Salary(){
        System.out.println("Inside Salary Constructor.");
    }

    public void getBasic(){
        System.out.println("Your Basic : "+basic);
    }
}
