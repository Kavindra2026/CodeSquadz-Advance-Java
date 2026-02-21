
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {
  public static void main(String[] args) throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    // Connect to Oracle XE
    Connection conn = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
    Statement st = conn.createStatement();
    st.executeUpdate("drop table survey16");
    // Prepare INSERT statement
    String INSERT_RECORD = "INSERT INTO survey16 (id, myDate) VALUES (?, ?)";
    st.executeUpdate("create table survey16(id, myDate) values (?,?)");
    PreparedStatement pstmt = conn.prepareStatement(INSERT_RECORD);
    pstmt.setInt(1, 1);
    System.out.println(new java.util.Date().getTime());
    java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());

    pstmt.setDate(2, sqlDate);
    pstmt.executeUpdate();
    ResultSet rs = st.executeQuery("SELECT *   FROM survey16");
    while (rs.next()) {
      System.out.println(rs.getDate(2));
    }
    rs.close();
    st.close();
    conn.close();
  }
}
