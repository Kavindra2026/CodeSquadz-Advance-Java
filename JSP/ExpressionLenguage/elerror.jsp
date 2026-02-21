 <%@ taglib prefix="c"uri="http://java.sun.com/jsp/jst1/core"%>
 <%@page isErrorPage="false"%>
 <html>
  <body>
    <b>Error:</b>${pageContext.exception}
    <br>
    <b>URI:</b>${pageContext.errorData.requestURI}
    <br>
    ${pageContext.errorData.statusCode}
    <c:forEach var="trace" items="${pageConext.exception.stackTrace}"><p>${trace}</p></c:forEach>
  </body>
 </html>
 

