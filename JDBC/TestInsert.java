import java.sql.*;

class TestInsert {
	public static void main(String[] ss) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/codesquadz", "root", "Savej@87");
			String t1 = "10004";
			String t2 = "hector";

			Statement s = c.createStatement();
			int x = s.executeUpdate("insert into emp101 values('" + t1 + "','" + t2 + "')");
			System.out.println(x);
			ResultSet result1 = s.executeQuery("select * from emp101");

			while (result1.next()) {
				System.out.println(result1.getString(1));
				System.out.println(result1.getString(1));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception i) {
			System.out.println(i);
		}
	}
}
