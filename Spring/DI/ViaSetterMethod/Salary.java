package spring;

public class Salary {
    private int basic;
    private int ta;
    private int da;

    public Salary() {
        System.out.println("Inside Salary constructor.");
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public void getBasic() {
        System.out.println("Your Basic : " + basic);
    }

    public void setTa(int ta) {
        this.ta = ta;
    }

    public void getTa() {
        System.out.println("Your Ta : " + ta);
    }

    public void setDa(int da) {
        this.da = da;
    }

    public void getDa() {
        System.out.println("Your Da : " + da);
    }
}