import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Delete Student</h2>");
        out.println("<form method='post'>");
        out.println("Roll No: <input type='text' name='roll' required><br><br>");
        out.println("<input type='submit' value='Delete'>");
        out.println("</form>");
        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String roll = req.getParameter("roll");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement("DELETE FROM student WHERE roll_no = ?");
            ps.setString(1, roll);

            int n = ps.executeUpdate();

            out.println("<html><body>");
            if (n > 0) {
                out.println("<h3>Student Deleted Successfully!</h3>");
            } else {
                out.println("<h3>No Student Found with Roll: " + roll + "</h3>");
            }

        } catch (SQLException e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            try { if (ps != null) ps.close(); } catch (Exception ex) {}
            try { if (con != null) con.close(); } catch (Exception ex) {}
        }

        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }
}
