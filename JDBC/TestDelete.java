import java.sql.*;
import java.util.*;

class TestDelete{
	public static void main(String []ss){
		try{
			Driver d= new com.mysql.cj.jdbc.Driver();
			Properties dbProp = new Properties();
			dbProp.put("user", "root");
			dbProp.put("password", "Savej@87");
			Connection c=d.connect("jdbc:mysql://localhost:3306/codesquadz",dbProp);
			
			String t5="1004";
			
			Statement s = c.createStatement();
			int a=s.executeUpdate("delet from emp101 where name ='"+t5+"'");
			System.out.println(a);
			ResultSet result1 = s.executeQuery("select * from emp101 ");
			
			while(result1.next()){
				System.out.println(result1.getString(1));
				System.out.println(result1.getString(2));
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(Exception i){System.out.println(i); }
	}
}