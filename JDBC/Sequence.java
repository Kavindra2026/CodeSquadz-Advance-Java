
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sequence {
  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

      Statement s = c.createStatement();
      s.executeUpdate("insert into emp22 values(seq77.nextval)");
      s.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
