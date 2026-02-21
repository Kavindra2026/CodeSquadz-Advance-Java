<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<title>JSTL fmt:bundle Tag</title>
</head>
<body>

<fmt:bundle basename="my.MyLocale"  >
   <fmt:message key="count.one"/><br/>
   <fmt:message key="count.two"/><br/>
   <fmt:message key="count.three"/><br/>
</fmt:bundle>

</body>
</html>