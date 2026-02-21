<%! int fontSize; %>
<html>

<head><title>WHILE LOOP Example</title></head>
<body>

<%while (fontSize <=7) { %>
   <font color="green" size="<%= fontSize %> ">
   JSP Tutorial
   </font><br/>
<% fontSize++;
   } %>
   
</body>
</html>	

<%--
http://localhost:7001/flowControl/while.jsp
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
--%>