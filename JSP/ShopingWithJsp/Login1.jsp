<%@ page session="false" %>
<html>
<body>
<head>
<title>Login Page</title>
</head>
<body bgcolor=66FFFF>
<%  
Cookie c[]=request.getCookies();
%>
<center><h1>Login Details</h1></center>
<br><center>
<form action='LoginData.jsp' method='post'>
<table>
<tr><td>
User Name :
</td>
<td>
<%
out.println("<input type='text' name='userid' value="+c[0].getValue()+"><br>");
%>
</td></tr>
<tr><td>
Password :
</td>
<td>
<%
out.println("<input type='password' name='pass' value="+c[1].getValue()+">");
%>
</td></tr>
</table>
<div>
<input type='checkbox' name='cookie' value='checked' checked='true'>
Remember Password
</div>
<div align='center'>
<input type='submit' name='submit' value='submit'>
</div>
</form>
</center>

</body>
</html>

		
