<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
<head>
<title>Tag Example</title>
</head>
<body>

 <c:set var="price" value="10.0" scope="session" />

    <c:out value="${price}"/>

   <c:out value="hello"/>

  
</body>
</html>