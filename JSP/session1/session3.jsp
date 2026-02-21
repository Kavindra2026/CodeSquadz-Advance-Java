<html>
<body>

<%@ page import="java.sql.* " %>
<%@ page session="true" %>

<%

session.setAttribute("name", "hello");
out.println("Session attribute set!");
%>

</body>
</html>