import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MarksServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Marks Entry</h2>");
        out.println("<form method='post'>");
        out.println("Roll No: <input type='text' name='roll' required><br><br>");
        out.println("Hindi: <input type='number' name='hindi' required><br><br>");
        out.println("English: <input type='number' name='english' required><br><br>");
        out.println("Math: <input type='number' name='math' required><br><br>");
        out.println("Science: <input type='number' name='science' required><br><br>");
        out.println("Art: <input type='number' name='art' required><br><br>");
        out.println("Social: <input type='number' name='social' required><br><br>");
        out.println("<input type='submit' value='Save / Update Marks'>");
        out.println("</form>");
        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            String roll = req.getParameter("roll");
            int hindi = Integer.parseInt(req.getParameter("hindi"));
            int english = Integer.parseInt(req.getParameter("english"));
            int math = Integer.parseInt(req.getParameter("math"));
            int science = Integer.parseInt(req.getParameter("science"));
            int art = Integer.parseInt(req.getParameter("art"));
            int social = Integer.parseInt(req.getParameter("social"));

            Connection con = DBUtil.getConnection();

            // UPDATE marks
            PreparedStatement ps = con.prepareStatement(
                "UPDATE marks SET HINDI=?, ENGLISH=?, MATH=?, SCIENCE=?, ART=?, SOCIAL=? WHERE ROLL_NO=?"
            );

            ps.setInt(1, hindi);
            ps.setInt(2, english);
            ps.setInt(3, math);
            ps.setInt(4, science);
            ps.setInt(5, art);
            ps.setInt(6, social);
            ps.setString(7, roll);

            int updated = ps.executeUpdate();
            ps.close();

            if (updated == 0) {
                // INSERT marks
                ps = con.prepareStatement(
                    "INSERT INTO marks (ROLL_NO, HINDI, ENGLISH, MATH, SCIENCE, ART, SOCIAL) VALUES (?,?,?,?,?,?,?)"
                );
                ps.setString(1, roll);
                ps.setInt(2, hindi);
                ps.setInt(3, english);
                ps.setInt(4, math);
                ps.setInt(5, science);
                ps.setInt(6, art);
                ps.setInt(7, social);

                ps.executeUpdate();
                out.println("<html><body><h3>Marks Inserted Successfully!</h3>");
            } else {
                out.println("<html><body><h3>Marks Updated Successfully!</h3>");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            out.println("<html><body><h3>Error: " + e.getMessage() + "</h3>");
        }

        out.println("<br><a href='home'>Back to Home</a>");
        out.println("</body></html>");
    }
}
