
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePoint {

  public static void main(String[] args) {
    

    try {

      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c= DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","system","root");

      Statement s=c.createStatement();

      c.setAutoCommit(false);
      int x=s.executeUpdate("update emp101 set name ='meesa' where pass='rabari1' ");

      s.executeUpdate("insert into emp101 values('dhonicsk2025' , dhonicsk2025)");

      Savepoint savept =c.setSavepoint("aaa");
      int x1=s.executeUpdate("delect  from emp101 where pass='jaddu'  ");
      
      s.executeUpdate("insert into emp101 values ('papu', 'rahul')");
      c.rollback(savept);


      //  c.releaseSavepoint(savept);

      c.commit();

      ResultSet result1 =  s.executeQuery(" select * from emp101");

      while (result1.next()) {
        System.out.println("id : " + result1.getString(1));
        System.out.println("name : " + result1.getString(2));
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
