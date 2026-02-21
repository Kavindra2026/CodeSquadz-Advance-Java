import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*; // Note: This import is not used in this specific class
import java.util.*;


public class AllPServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html><body>");
        
        // Get an Enumeration of all parameter names
        Enumeration<String> e = req.getParameterNames();
        
        // Loop through the parameter names
        while (e.hasMoreElements()) {
            // Get the next parameter name
            String name = e.nextElement();
            
            // Get the value associated with that name
            String value = req.getParameter(name);
            
            // Print the name-value pair
            out.println(name + " = " + value);
            out.println("<br>");
        }
        
        out.println("</body></html>");
    }
}