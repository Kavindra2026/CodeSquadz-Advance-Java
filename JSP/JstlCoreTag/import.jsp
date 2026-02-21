<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
<head>
<title>Tag Example</title>
</head>
<body>

<c:import url="http://www.google.com" var="tutorial" />

 <c:out value="${tutorial}" /> 
  
  
</body>
</html>