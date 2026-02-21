<%@ page isThreadSafe="false" %>
<html>
<body>

<%
out.println(Thread.currentThread().getName());
%>
<br>

<%
out.println(this);
try{
Thread.sleep(6000);
}catch(Exception e){ }

%>
</body>
<html>
<%--
for isThreadSafe=false
[ACTIVE] ExecuteThread: '1' for queue: 'weblogic.kernel.Default (self-tuning)'
jsp_servlet.__isthreadsafe@65fbf440
[ACTIVE] ExecuteThread: '2' for queue: 'weblogic.kernel.Default (self-tuning)'
jsp_servlet.__isthreadsafe@65fbf440

for isThreadSafe=true
[ACTIVE] ExecuteThread: '2' for queue: 'weblogic.kernel.Default (self-tuning)'
jsp_servlet.__isthreadsafe@9ea54b7
[ACTIVE] ExecuteThread: '5' for queue: 'weblogic.kernel.Default (self-tuning)'
jsp_servlet.__isthreadsafe@9ea54b7
--%>