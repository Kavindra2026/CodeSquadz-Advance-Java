<%! String name,pass; %>

<% String name=request.getParameter("name");
String pass=request.getParameter("pass");
%>
<jsp:forward page="demo1.jsp" >
<jsp:param name="name" value="<%=name %>" />
<jsp:param name="pass" value="<%=pass %>" />
</jsp:forward>
<br>
<%= "example of include action" %>

<%--
jsp:include
via demo1.jsp
example of include action
jsp:forward
via demo1.jsp
--%>