<%@ taglib prefix="MyTag" uri="/WEB-INF/tlds/my.tld" %>

<%
    String s="Attribute";
%>

<MyTag:MyDate name="<%=s %>">
    <MyTag:SubTag />
</MyTag:MyDate>
