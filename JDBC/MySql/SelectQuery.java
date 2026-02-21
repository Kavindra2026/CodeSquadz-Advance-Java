
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class SelectQuery {
  public static void main(String[] args) {
    try {
      // 1
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 2
      Connection c = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/Sarthak",
          "root",
          "root");

      // 3 create the statement object
      Statement st = c.createStatement();

      // 4 select query
      String s = "SELECT * FROM students";

      ResultSet rs = st.executeQuery(s);

      while (rs.next()) {

        String name = rs.getString("name");
        int rollno = rs.getInt("rollno");
        int mark = rs.getInt("mark");

        System.out.println(name + " :  ");
        System.out.println(rollno + " :  ");
        System.out.println(mark + " :  ");
        System.out.println("--------------------");

      }
    } catch (Exception e) {

      e.printStackTrace();
    }

  }
}