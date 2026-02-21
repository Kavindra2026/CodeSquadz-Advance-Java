import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>CBSE System</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("</head><body>");

        out.println("<h1>CBSE Result Management</h1>");

        out.println("<ul>");
        out.println("<li><a href='register'>Student Registration (Insert)</a></li><br>");
        out.println("<li><a href='marks'>Marks Entry (Insert/Update)</a></li><br>");
        out.println("<li><a href='updateStudent'>Update Student Details</a></li><br>");
        out.println("<li><a href='deleteStudent'>Delete Student</a></li><br>");
        out.println("<li><a href='result'>Check Result</a></li>");
        out.println("</ul>");

        out.println("</body></html>");
    }
}
