<%@ page import="java.io.*,com.oreilly.servlet.*" %>
<%
try {
    String path = application.getRealPath("/") + "dt";
    File f = new File(path);
    if(!f.exists()) f.mkdirs();

    MultipartRequest mr = new MultipartRequest(
        request,
        path,
        500*1024*1024
    );

    String fname = mr.getOriginalFileName("file");
    out.print("Uploaded Successfully: " + fname);
}
catch(Exception e){
    out.print(e);
}
%>
