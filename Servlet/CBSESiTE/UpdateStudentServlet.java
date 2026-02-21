import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UpdateStudentServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Update Student Details</h2>");
        out.println("<form method='post'>");
        out.println("Roll No (Existing): <input type='text' name='roll' required><br><br>");
        out.println("New Name: <input type='text' name='name' required><br><br>");
        out.println("New Class: <input type='text' name='cls' required><br><br>");
        out.println("<input type='submit' value='Update'>");
        out.println("</form>");
        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }

   
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String roll = req.getParameter("roll");
        String name = req.getParameter("name");
        String cls = req.getParameter("cls");

        out.println("<html><body>");

        if (roll.isEmpty() || name.isEmpty() || cls.isEmpty()) {
            out.println("<h3>All fields are mandatory!</h3>");
            out.println("<br><a href='home'>Back to Home</a>");
            out.println("</body></html>");
            return;
        }

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(
                "UPDATE student SET name=?, class_name=? WHERE roll_no=?");
            ps.setString(1, name);
            ps.setString(2, cls);
            ps.setString(3, roll);

            int n = ps.executeUpdate();

            if (n > 0)
                out.println("<h3>Student Updated Successfully!</h3>");
            else
                out.println("<h3>No Student Found with Roll: " + roll + "</h3>");

        } catch (SQLException e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            try { if (ps != null) ps.close(); } catch (Exception ignored) {}
            try { if (con != null) con.close(); } catch (Exception ignored) {}
        }

        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }
}
