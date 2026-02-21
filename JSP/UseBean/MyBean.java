package my;

import java.sql.*;

public class MyBean {
  private String name;
  private String pass;

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getPass() {
    return pass;
  }

  // Validation Method
  public String validate() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
      Statement s = c.createStatement();

      // Vulnerable to SQL Injection, but matches source code
      String s1 = "select * from emp101 where name='" + name + "' and pass='" + pass + "'";
      ResultSet rs = s.executeQuery(s1);

      if (rs.next()) {
        return "wel.jsp"; // Login Success
      } else {
        return "err.jsp"; // Login Failure
      }
    } catch (Exception e) {
      return "invalid";
    }
  }
}