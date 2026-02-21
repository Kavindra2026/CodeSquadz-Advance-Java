<%@ taglib prefix="SqlTag" uri="/WEB-INF/tlds/db.tld" %>

<html>
<body>

<SqlTag:DbTag
 driver="oracle.jdbc.driver.OracleDriver"
 url="jdbc:oracle:thin:@localhost:1521:xe"
 user="system"
 pass="mca6" >

<SqlTag:Insert query="insert into emp65 values(5,'abc')" />

<SqlTag:Update query="update emp65 set name='Sunny' where id=3028" />

<SqlTag:Delete query="delete from emp65 where id=2099" />

<SqlTag:Select query="select * from emp65" />

</SqlTag:DbTag>

</body>
</html>
