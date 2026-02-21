<%
Cookie cl[] = request.getCookies();

if(cl != null)
{
    for(int i=0; i<cl.length; i++)
    {
        out.println(cl[i].getName());
        out.println(" = ");
        out.println(cl[i].getValue());
        out.println("<br>");
    }
}
else
{
    out.println("No cookies found");
}
%>
