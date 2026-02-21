import java.io.*;
import java.sql.*;
public class BlobClobEx {
  public static void main(String[] args) throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
    Statement stmt = conn.createStatement();
    createBlobClobTables(stmt);

    // Insert BLOB and CLOB data
    PreparedStatement pstmt = conn.prepareStatement("INSERT BlobClob VALUES(40, ?,? )");
    File file = new File("blob.txt");
    FileInputStream fis = new FileInputStream(file);
    pstmt.setBinaryStream(1, fis, file.length());
    fis.close();
    pstmt.close();
    pstmt.execute();
    System.out.println("Data inserted successfully.");
    ResultSet rs = stmt.executeQuery("SELECT * FROM BlobClob WHERE id =40");
    rs.next();
    java.sql.Clob clob = rs.getClob(3);
    byte blobVal[] = new byte[(int) blob.length()];

    InputStream blobIs = blob.getBinaryStream();
    blobIs.read(blobVal);
    String s = new String(blobVal);
    System.out.println(s);
    blobIs.close();
    char clobVal[] = new char[(int) clob.length()];
    Reader r = clob.getCharacterStream();
    r.read(clobVal);
    String sw = new String(clobVal);
    System.out.println(sw);
    r.close();
  }

  public static void createBlobClobTables(Statement stmt) throws Exception {
    String Sql = "CREATE TABLE BlobClob(ID NUMBER(3), B BLOB, c CLOB)";
    try {
      stmt.executeUpdate("DROP TABLE BlobClob");
    } catch (SQLException se) {

      if (se.getErrorCode() == 942) {
        System.out.println("Error dropping BlobClob table : " + se.getMessage());
      }
      if (stmt.executeUpdate(Sql) == 0) {
        System.out.println("BlobClob table created... ");
     }
    }
  }
}