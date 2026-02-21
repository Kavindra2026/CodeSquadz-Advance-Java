<html>
<body>

<%
Integer count=(Integer)pageContext.getAttribute("count", PageContext.APPLICATION_SCOPE);
if(count==null)
{
count=new Integer(0);
}
count=new Integer(count.intValue()+1);
pageContext.setAttribute("count", count, PageContext.APPLICATION_SCOPE);
out.println("count=" +count.intValue());

%>


</body>
</html>

<%--
http://localhost:7001/JSP/demoJsp/pagecontext.jsp
count=10


--%>