import java.sql.*;
import java.io.*;

class Oracle2 {
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
                "create table artists(" +
                "artist_id number PRIMARY KEY," +
                "artist_name varchar(20))"
            );

            System.out.println("table created");
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
