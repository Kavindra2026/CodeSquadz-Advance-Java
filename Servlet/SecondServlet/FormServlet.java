import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;






public class FormServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {

        // Use PrintWriter for text, it's the standard practice
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<head><title>Form Submission Details</title></head>");
        out.println("<body>");
        out.println("<h1>Here is your Form Data:</h1>");

        // --- Extract the form data here ---
        String title = req.getParameter("title");
        String name = req.getParameter("name");
        String city = req.getParameter("city");
        String country = req.getParameter("country");
        String tel = req.getParameter("tel");
        String age = req.getParameter("age");

        // --- Extracting data from the checkbox field ---
        String[] interests = req.getParameterValues("interests");

        // --- Output the data into a web page ---
        // Using <p> tags is better for structure than <br>
        out.println("<p><b>Your title is:</b> " + title + "</p>");
        out.println("<p><b>Your name is:</b> " + name + "</p>");
        out.println("<p><b>Your city is:</b> " + city + "</p>");
        out.println("<p><b>Your country is:</b> " + country + "</p>");
        out.println("<p><b>Your tel is:</b> " + tel + "</p>");
        out.println("<p><b>Your age group is:</b> " + age + "</p>");

        out.println("<p><b>Your interests include:</b></p>");
        out.println("<ul>");

        // *** CRITICAL FIX: Check if interests is null before looping ***
        if (interests != null) {
            for (String interest : interests) {
                out.println("<li>" + interest + "</li>");
            }
        } else {
            out.println("<li>No interests were selected.</li>");
        }
        
        out.println("</ul>");
        out.println("</body></html>");
        out.close(); // Good practice to close the writer
    }
}