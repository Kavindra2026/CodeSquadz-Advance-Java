<%! int fontSize; %>
<html>
<body>

<% for(fontSize=1; fontSize<=10; fontSize++ ) { %>
   <font color="red" size="<%= fontSize %> ">
   JSP Tutorial
   </font><br/>
<% } %>

</body>
</html>	

<%--
http://localhost:7001/flowControl/loop.jsp
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
JSP Tutorial
--%>