<%! int day=2; %>
<html>
<body>
<% 
switch (day)
{
case 0:  %>
  <font color="red" size="10" >
  JSP Tutorial
  </font><br/>
  <% break;
case 1: %>
   <font color="yellow" size="10" >
   Its MONDAY
   </font><br/>
   <% break;
case 2: %>
   <font color="orange" size="10" >
   Its TUESDAY
   </font><br/>
   <% break; 
case 3: 
   out.println("Its Wednesday");
   break;   

case 4: 
   out.println("Its Thursday");
   break;   

case 5: 
   out.println("Its Friday");
   break;   

case 6: 
   out.println("Its Saturday");
   break;   

default: 
   out.println("Its Sunday");
 
}
%>
</body>
</html>	

<%--
http://localhost:7001/flowControl/switch.jsp
Its TUESDAY
--%>