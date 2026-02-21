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
<sql:update dataSource="${ds}" var="count">
  delete  from  emp65  where  id=15 
</sql:update>
<sql:update dataSource="${ds}" 
	                  sql="UPDATE  emp65 SET name='pk12'  WHERE id =?" 
	                  var="result"  >
 <sql:param value="9016"></sql:param>
	</sql:update>	

<sql:query dataSource="${ds}" var="result">
SELECT * from emp65
</sql:query>
 
<table border="1" width="100%">
<tr>
<th>Name</th>
<th>Id</th>

</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
<td><c:out value="${row.name}" /></td>
<td><c:out value="${row.id}" /></td>
</tr>
</c:forEach>
</table>

</body>
</html>