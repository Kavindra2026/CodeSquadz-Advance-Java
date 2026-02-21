import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tran {

  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

      Statement s = c.createStatement();

      c.setAutoCommit(false);

      int x = s.executeUpdate("update emp101 set name='teju420' where  pass='rabari1' ");

      ResultSet result1 = s.executeQuery("select  *  from  emp101  where pass =rabari1");

      while (result1.next()) {
        System.out.println("name" + result1.getString(1));
        System.out.println("pass" + result1.getString(2));
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
