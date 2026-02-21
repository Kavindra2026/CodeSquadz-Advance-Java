<html>
<body>

<%@ page import="java.sql.* " %>
<%@ page session="false" %>

<%

String name=(String)session.getAttribute("name");
String pass=(String)session.getAttribute("pass");
out.println(name +" "+ pass);
out.println("<br>");
out.println(" "+session.isNew());

%>

</body>
</html>