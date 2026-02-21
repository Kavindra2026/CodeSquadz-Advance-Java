<%
Cookie firstName = new Cookie(
    "first_name",
    request.getParameter("first_name")
);

Cookie lastName = new Cookie(
    "last_name",
    request.getParameter("last_name")
);

firstName.setMaxAge(60*60);
lastName.setMaxAge(60*60);

response.addCookie(firstName);
response.addCookie(lastName);

out.println("cookies Added");
%>

<html>
<body>
<ul>
    <li><b>First Name:</b>
        <%= request.getParameter("first_name") %>
    </li>
    <li><b>Last Name:</b>
        <%= request.getParameter("last_name") %>
    </li>
</ul>
</body>
</html>
