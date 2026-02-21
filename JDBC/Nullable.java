
import java.sql.*;

public class Nullable {
  public static void main(String[] args) throws Exception {

    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

    String sql = "CREATE TABLE users11(id NUMBER(11)NOT NULL, username VARCHAR(64))";

    Statement statement = conn.createStatement();

    statement.execute(sql);
    ResultSet resultSet = statement.executeQuery("SELECT id, username FORM user11");
    ResultSetMetaData metadata = resultSet.getMetaData();

    int nullability = metadata.isNullable(1);
    if (nullability == ResultSetMetaData.columnNoNulls) {
      System.out.println("Columns ID or name can have a null value");
    } else if (nullability == ResultSetMetaData.columnNoNulls) {
      System.out.println("Columns ID does not allowed to have a null value");

    } else if (nullability == ResultSetMetaData.columnNullableUnknown) {
      System.out.println("nullability unknown");

    }
  }

}
