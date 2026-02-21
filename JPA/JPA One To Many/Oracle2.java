import java.sql.*;
import java.io.*;

class Oracle2 {

    public static void main(String[] lss) {

        System.out.println("hhhhhh");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c =
              DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "jpa","jpa");

            Statement s = c.createStatement();

            s.executeUpdate(
              "create table artists(artist_id number PRIMARY KEY, artist_name varchar(20))"
            );

            System.out.println("table created");
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
