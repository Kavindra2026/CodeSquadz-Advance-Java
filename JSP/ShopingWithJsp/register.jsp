<%@ page session="false" %>

<html>
<head>
<title>REGISTRATION</title>
 
</head>

<body bgcolor="#FFFFA9">
<form  method="POST" action="RegisterData.jsp">
<div align="center"> 
  <p><marquee behavior="alternate">
    <font color="#B20202" size="5" face="Monotype Corsiva"><strong><font size="6">WELCOME 
    TO ONLINE SHOPPING SITE</font></strong></font> 
    </marquee><br><br>
	<hr width="75%" color="#BA0D07">
  </p>
  <p><strong><font color="#FF0000"><em><font color="#000099" size="5"> REGISTRATION FORM</font></em></font></strong><br>
  <hr width="20%" color="#000099"></p>
  <table width="66%" border="2" cellspacing="2" cellpadding="1" bgcolor="#FCCF06">
    <tr> 
      <td width="220" height="210" rowspan="4" align="center"><font color="#FFFF00">
	  <input name="imageField" type="image" src="images/login.jpg" width="220" height="210" border="0">
	  </font></td>
      <td height="55" colspan="2">
<div align="center"><font color="#B20202" size="4"><strong> Enter ur UserId and 
            Password </strong></font></div></td>
    </tr>
    <tr> 
      <td  height="50"><div align="center"><font color="#B20202"><strong>Enter 
          UserID:</strong></font></div></td>
      <td height="50">
          <div align="center"> <font color="#FFFF00">
            <input type="text" name="userid">
            </font></div>
        </td>
    </tr>
    <tr> 
      <td height="50">
<div align="center"><font color="#B20202"><strong>Enter 
          Password:</strong></font></div></td>
      <td height="50"> 
        
          <div align="center"> <font color="#FFFF00">
            <input type="password" name="pass">
            </font></div>
        </td>
    </tr>
    <tr> 
      <td height="50" colspan="2">
          <div align="center">
            <input type="submit" name="Submit" value="Login" onClick="validate()">
           
			<input type="reset" name="Reset" value="Reset">
          </div>
        </td>
    </tr>
  </table><br><br>
  <font color="#B20202" size="5" face="Monotype Corsiva"><strong><font size="6"> 
  <a href="front.jsp"> Already Registered Login now</a></font></strong></font> 
</div>
</form>
</body>
</html>
















