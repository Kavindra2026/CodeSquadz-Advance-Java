package my;
import java.sql.*;

public class AddBean {

    private int firstno;
    private int secondno;

    public void setFirstno(int firstno) {
        this.firstno = firstno;
    }

    public void setSecondno(int secondno) {
        this.secondno = secondno;
    }

    public int getFirstno() {
        return firstno;
    }

    public int getSecondno() {
        return secondno;
    }

    public int add() {
        return firstno + secondno;
    }
}
/*javac -d WEB-INF/classes src/my/AddBean.java src/my/MyBean.java*/