
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyExecuteMethod {

  public static void main(String[] args) {

    Connection con = null;
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

      Statement stmt = con.createStatement();

      String update = "update emp101 set name ='keju421', where pass='rabari1' ";
      String query = "select * from emp101";

      boolean status1 = stmt.execute(update);
      int count = stmt.getUpdateCount();
      System.out.println("Total records update :  " + count);

      boolean status = stmt.execute(query);
      if (status) {
        ResultSet rs = stmt.getResultSet();
        while (rs.next()) {
          System.out.println(rs.getString(1));
          System.out.println(rs.getString(2));
        }
        rs.close();
      }

    } catch (Exception e) {
    }

  }

}
