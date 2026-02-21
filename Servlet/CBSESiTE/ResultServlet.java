import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

   
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Check Result</h2>");
        out.println("<form method='post'>");
        out.println("Roll No: <input type='text' name='roll' required><br><br>");
        out.println("<input type='submit' value='Show Result'>");
        out.println("</form>");
        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }

    
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String roll = req.getParameter("roll");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(
                "SELECT s.name, s.class_name, m.* FROM student s LEFT JOIN marks m ON s.roll_no = m.roll_no WHERE s.roll_no=?");
            ps.setString(1, roll);
            rs = ps.executeQuery();

            if (rs.next()) {

                String name = rs.getString("name");
                String cls = rs.getString("class_name");

                int hindi = rs.getInt("hindi");
                int english = rs.getInt("english");
                int math = rs.getInt("math");
                int science = rs.getInt("science");
				int art = rs.getInt("art");
                int social = rs.getInt("social");


                int total = hindi + english + math + science + social + art;
                double percent = total / 6.0;

                String status = (hindi >= 33 && english >= 33 && math >= 33 && science >= 33 && social >= 33 && art >= 33 )
                        ? "PASS" : "FAIL";

                String grade;
                if (percent >= 90) grade = "A+";
                else if (percent >= 75) grade = "A";
                else if (percent >= 60) grade = "B";
                else if (percent >= 45) grade = "C";
                else if (percent >= 33) grade = "D";
                else grade = "E";

                out.println("<h2>CBSE Result</h2>");
                out.println("Roll No: " + roll + "<br>");
                out.println("Name: " + name + "<br>");
                out.println("Class: " + cls + "<br><br>");
                out.println("<b>Marks:</b><br>");
                out.println("Hindi: " + hindi + "<br>");
                out.println("English: " + english + "<br>");
                out.println("Math: " + math + "<br>");
                out.println("Science: " + science + "<br>");
                out.println("Social: " + social + "<br>");
                out.println("Art: " + art+ "<br><br>");

                out.println("Total: " + total + "<br>");
                out.println("Percentage: " + String.format("%.2f", percent) + "%<br>");
                out.println("Grade: <b>" + grade + "</b><br>");
                out.println("Status: <b>" + status + "</b><br>");

            } else {
                out.println("<h3>No Student Found!</h3>");
            }

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }

        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }
}
