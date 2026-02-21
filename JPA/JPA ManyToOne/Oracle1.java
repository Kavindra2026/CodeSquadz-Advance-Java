import java.sql.*;
import java.io.*;

class Oracle1 {
    public static void main(String[] lss) {
        System.out.println("hhhhhhhh");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "mac6"
            );

            Statement s = c.createStatement();
            s.executeUpdate(
                "create table albums(" +
                "album_id number PRIMARY KEY," +
                "album_name varchar(20)," +
                "album_year number," +
                "artist_id number," +
                "FOREIGN KEY (artist_id) REFERENCES artists(artist_id))"
            );

            System.out.println("table created");
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
