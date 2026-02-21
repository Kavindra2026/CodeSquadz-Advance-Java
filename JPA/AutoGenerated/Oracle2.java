import java.sql.*;
import java.io.*;

class Oracle2
{
    public static void main(String[] args)
    {
        System.out.println("hhhhhhhh");

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "jpa",
                "jpa");

            Statement s = c.createStatement();
            s.executeUpdate(
                "create table Person14(id number, name varchar(20), surname varchar(20))"
            );

            System.out.println("table created");
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
