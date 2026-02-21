import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Student Registration</h2>");
        out.println("<form method='post'>");
        out.println("Name: <input type='text' name='name' required><br><br>");
        out.println("Roll No: <input type='text' name='roll' required><br><br>");
        out.println("Class: <input type='text' name='cls' required><br><br>");
        out.println("<input type='submit' value='Register'>");
        out.println("</form>");
        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }

   
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String roll = req.getParameter("roll");
        String cls  = req.getParameter("cls");

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtil.getConnection();

            ps = con.prepareStatement(
                "INSERT INTO student (roll_no, name, class_name) VALUES (?, ?, ?)");
            ps.setString(1, roll);
            ps.setString(2, name);
            ps.setString(3, cls);

            ps.executeUpdate();

            out.println("<html><body>");
            out.println("<h3>Student Registered Successfully!</h3>");

        } catch (SQLException e) {
            out.println("<html><body>");
            if (e.getMessage().contains("unique") || e.getMessage().contains("constraint")) {
                out.println("<h3>Roll Number Already Exists!</h3>");
            } else {
                out.println("<h3>Error: " + e.getMessage() + "</h3>");
            }
        } finally {
            try { if (ps != null) ps.close(); } catch (Exception ex) {}
            try { if (con != null) con.close(); } catch (Exception ex) {}
        }

        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }
}
