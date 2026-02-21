<html>
<body>

<%@ page import="java.sql.* " %>
<%@ page session="false" %>

<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
Statement s=c.createStatement();
String s1="select * from emp78 where name='"+name+"' and pass='"+pass+"'";
ResultSet rs=s.executeQuery(s1);
if(rs.next())
{
HttpSession s2=request.getSession();
s2.setAttribute("name",name);
s2.setAttribute("pass",pass);
out.println("data set successfully..."+s2.isNew());
out.println("<br>");
out.println("<a href='session1.jsp' >Welcome</a>");
}else
out.println("User is invalid");
}catch(Exception e)
{
out.println(e);
}

%>

</body>
</html>