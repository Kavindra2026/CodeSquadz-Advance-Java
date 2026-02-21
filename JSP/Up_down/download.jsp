<%@ page import="java.io.*" %>
<%
try {
    String filename = request.getParameter("name");
    String path = application.getRealPath("/") + "dt\\" + filename;

    File ff = new File(path);

    response.setContentType("application/octet-stream");
    response.setHeader(
        "Content-Disposition",
        "attachment;filename=" + filename
    );

    FileInputStream fis = new FileInputStream(ff);
    OutputStream os = response.getOutputStream();

    byte[] b = new byte[1024];
    int i;
    while((i = fis.read(b)) != -1){
        os.write(b, 0, i);
    }

    fis.close();
    os.close();
}
catch(Exception e){}
%>
