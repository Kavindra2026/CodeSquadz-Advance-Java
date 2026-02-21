
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Sqrt {
  public static void main(String[] args) {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe", "system", "root");
      int t1 = 123;
      String t2 = "lalu";
      Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

      ResultSet result1 = s.executeQuery("SELECT * FROM Employee WHERE SQRT (empSalary)>10");
      while (result1.next()) {
        System.out.println(result1.getString(1));
        System.out.println(result1.getString(2));
      }

    } catch (SQLException e) {
      System.out.println(e);
    } catch (Exception i) {
      System.out.println(i);
    }

  }
}