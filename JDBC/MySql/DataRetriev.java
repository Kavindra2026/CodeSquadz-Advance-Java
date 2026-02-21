import java.sql.*;

class DataRetrieve {
  public static void main(String[] args) {
    try {
      // 1️⃣ Load Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 2️⃣ Connect to MySQL
      Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/testdb", "root", "root");

      // 3️⃣ Create Statement
      Statement stmt = con.createStatement();

      // 4️⃣ Execute Query
      ResultSet rs = stmt.executeQuery("SELECT * FROM student");

      // 5️⃣ Display Data
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int marks = rs.getInt("marks");
        System.out.println(id + " | " + name + " | " + marks);
      }

      // 6️⃣ Close Connection
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
