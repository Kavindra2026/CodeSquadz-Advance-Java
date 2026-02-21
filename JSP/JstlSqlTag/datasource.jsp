<%@ taglib uri="/WEB-INF/sql.tld" prefix="sql" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
<head>
<title>JSTL sql:query Tag</title>
</head>
<body>
 
<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver"
     url="jdbc:oracle:thin:@localhost:1521:xe"
     user="system"  password="mca6" />

<sql:query dataSource="${ds}" var="result">
SELECT * from emp1
</sql:query>
 
<table border="1" width="100%">
<tr>
<th>Name</th>
<th>Pass</th>

</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
<td><c:out value="${row.NAME}" /></td>
<td><c:out value="${row.PASS}" /></td>
</tr>
</c:forEach>
</table>

</body>
</html>