import java.sql.*;
import java.io.*;

class Oracle1 {

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
              "create table albums(album_id number PRIMARY KEY, album_name varchar(20), album_year number, artist_id number, FOREIGN KEY (artist_id) REFERENCES artists)"
            );

            System.out.println("table created");
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
