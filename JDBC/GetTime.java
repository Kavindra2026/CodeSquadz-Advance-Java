import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetTime {

  public static void main(String[] args) throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc: oracle: thin :@localhost:1521:xe",
        "system", "mca6");
    Statement st = conn.createStatement();
    st.executeUpdate("drop table survey113");
    st.executeUpdate("create table survey113 (id number (3) ,myDate TIMESTAMP )");
    // System.out.println("after");
    String INSERT_RECORD = "insert into survey113(id, myDate) values(?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(INSERT_RECORD);
    pstmt.setInt(1, 1);
    java.sql.Time sqlDate = new java.sql.Time(new java.util.Date().getTime());
    pstmt.setTime(2, sqlDate);

    pstmt.executeUpdate();

    ResultSet rs = st.executeQuery("SELECT  *  FROM survey113");

    while (rs.next()) {
      System.out.println(rs.getTime(2));

    }

    rs.close();
    st.close();
    conn.close();
  }
}