<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
<head>
<title>Tag Example</title>
</head>
<body>

<c:forTokens items="amit,sachin,dinesh" delims="," var="name">
   <c:out value="${name}"/><p>
</c:forTokens>
  
</body>
</html>