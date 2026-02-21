<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>

<html>
<body>
<h2>Spring's form tags example</h2>

<table>
<tr>
<td>UserName :</td><td>${customer.userName}</td>
</tr>
<tr>
<td>Address :</td><td>${customer.address}</td>
</tr>
<tr>
<td>Password :</td><td>${customer.password}</td>
</tr>
<tr>
<td>Confirm Password :</td><td>${customer.confirmPassword}</td>
</tr>
<tr>
<td>Receive Newsletter :</td><td>${customer.receiveNewsletter}</td>
</tr>
<tr>
<td>Favourite Web Frameworks :</td>
<td>

</td>
</tr>
<tr>
<td>Sex :</td><td>${customer.sex}</td>
</tr>
<tr>
<td>Favourite Number :</td><td>${customer.favNumber}</td>
</tr>
<tr>
<td>Country :</td><td>${customer.country}</td>
</tr>
<tr>
<td>Java Skills :</td><td>${customer.javaSkills}</td>
</tr>
<tr>
<td>Hidden Value :</td><td>${customer.secretValue}</td>
</tr>

</table>

</body>
</html>