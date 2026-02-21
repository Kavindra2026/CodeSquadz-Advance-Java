<html>
<body>
<%
String name = request.getParameter("name");
String pass = request.getParameter("pass");

RequestDispatcher rd = request.getRequestDispatcher("demo.jsp");
rd.include(request, response);

if(name != null && pass != null) {
    if(name.equals("RadhaRani") && pass.equals("RadhaRani"))
        out.println("valid");
    else
        out.println("invalid");
} else {
    out.println("Please enter Name and Password from the form.");
}
%>

</body>
</html>

<%-- output
http://localhost:7001/JSP/demoJsp/parameter.jsp?name=RadhaRani&pass=RadhaRani

Hello jsp
Hello jsp via expression
valid
--%>