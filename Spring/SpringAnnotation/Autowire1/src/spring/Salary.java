package spring;

public class Salary {

    private int basic;
    private int ta;
    private int da;

    public Salary(){

        System.out.println("Inside Salary constructor. ");
        basic=10000;
        ta=100;
        da=2000;
    }

    public void getBasic()
    {

        System.out.println("Your Basic : "+basic);
    }

    public void setBasic(int basic) {

        this.basic = basic;
    }

    public void getTa() {

        System.out.println("Your Ta : " +ta);
    }

    public void setTa(int ta) {
        this.ta = ta;
    }

    public void getDa() {

        System.out.println("Your Ta : " +da);
    }

    public void setDa(int da) {

        this.da = da;
    }
}
