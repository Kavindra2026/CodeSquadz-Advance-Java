<html>
<body>
<%! String s;
public void jspInit()
{
ServletConfig con=getServletConfig();
s=con.getInitParameter("name");
}
%>

<%
String s1=application.getInitParameter("name1");
String s2=config.getInitParameter("name");
out.println(s1);
out.println("<br>");
out.println(s2+s);
%>

</body>
</html>

<%--
http://localhost:7001/JSP/demoJsp/init.jsp
Radha Rani Sudh Ji je Humari
Om shree Bhagwate Bashu devaye namhaOm shree Bhagwate Bashu devaye namha

--%>