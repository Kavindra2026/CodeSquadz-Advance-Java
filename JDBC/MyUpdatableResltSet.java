import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyUpdatableResltSet {

	public static void main(String a[]) {
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codesquadz", "root", "Savej@87");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select accno, bal from bank1");
			rs.next();
			rs.next();
			rs.deleteRow();
			System.out.println("record deleted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}