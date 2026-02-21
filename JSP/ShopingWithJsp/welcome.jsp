<%@ page session="false" %> 
<html>
<head>
<title>select an item</title></head>
<%
HttpSession session = request.getSession(false);   
if(session!=null)
{
%>

<body  bgcolor ="#FFFFA9" background ="">
<br><br>
<h2><center><font color="#B20202" size="5" face="Monotype Corsiva"><strong><font size="6">SELECT ANY ITEM </font></strong></font> </u></center></h2>
<hr  size ="10"  color ="CC0000"><hr color ="CC0000" size ="5">
<table align ="center" border ="5" bgcolor="9900FF" cellspacing="6" width="100" height="50">
<tr>
<td><a href="mobile.jsp" target="_top"><input type ="button" name ="mbl" value ="MOBILE"></a></td>
<td><a href="laptop.jsp" target="_top"><input type ="button" name ="lap" value ="LAPTOP"></a></td>
<td><a href="cars.jsp" target="_top"><input type ="button" name ="cr" value ="CARS"></a></td>
<td><a href="watch.jsp" target="_top"><input type ="button" name ="wtch" value ="WATCHES"></a></td>
<td><a href="pd.jsp" target="_top"><input type ="button" name ="pen" value ="PENDRIVE"></a></td>
<td><a href="calculator.jsp" target="_top"><input type ="button" name ="calci" value ="CALCULATORS"></a></td>
<td><a href="logout.jsp" target="_top"><input type ="button" name ="logout" value ="LOGOUT"></a></td>

</tr>

</table><br><br>
<center><img src="images/8.jpg" width="300" height="300">
<br><br>
<a href ="cart.jsp">SHOW   MY   CART</a>
</center>

<%
}
else
{
%>
 	<jsp:forward page="front.jsp"/>
<%
}
%>


</body>
</html>