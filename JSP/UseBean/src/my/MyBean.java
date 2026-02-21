package my;

import java.sql.*;

public class MyBean {

    private String name;
    private String pass;

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String validate() {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            c = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system", "mca6");

            String sql = "SELECT * FROM emp3 WHERE name=? AND pass=?";
            ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);

            rs = ps.executeQuery();

            if (rs.next()) {
                return "wel.jsp";
            } else {
                return "err.jsp";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "err.jsp";     // safer fallback Page
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (c != null) c.close();
            } catch (Exception ex) { }
        }
    }
}

/*
Compile Command:
javac -d WEB-INF/classes src/my/MyBean.java
*/
