package my;

public class AddBean {
    private int firstno;
    private int sencondno;

    // Setters
    public void setFirstno(int firstno) {
        this.firstno = firstno;
    }

    public void setSencondno(int sencondno) {
        this.sencondno = sencondno;
    }

    // Getters
    public int getFirstno() {
        return firstno;
    }

    public int getSencondno() {
        return sencondno;
    }

    // Business Logic
    public int add() {
        return firstno + sencondno;
    }
}