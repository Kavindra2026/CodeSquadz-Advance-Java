import java.io.File;
import java.sql.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class DatabaseToXml{
  public static void main(String[] args)
  {
     String filePath = "Database.xml";
     File xmlFile = new File(filePath);
     DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
     DocumentBuilder dBuilder;
  try {
dBuilder = dbFactory.newDocumentBuilder();
Document doc = dBuilder.parse(xmlFile);
Element e=doc.getDocumentElement();
e.normalize() ;

      String driver = doc.getElementsByTagName("driver").item(0).getTextContent();
      String url = doc.getElementsByTagName("url").item(0).getTextContent();
      String username = doc.getElementsByTagName("username").item(0).getTextContent();
      String password = doc.getElementsByTagName("password").item(0).getTextContent();

       Class.forName(driver);
       Connection conn = DriverManager.getConnection(url, username, password);

       String sql = "SELECT id, name, phone, subject FROM student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
 
            Document outDoc = dBuilder.newDocument();
            // root element
            Element rootElement = outDoc.createElement("students");
            outDoc.appendChild(rootElement);

            while (rs.next()) {
                Element studentElem = outDoc.createElement("student");

                // id
                Element idElem = outDoc.createElement("id");
                idElem.appendChild(outDoc.createTextNode(String.valueOf(rs.getInt("id"))));
                studentElem.appendChild(idElem);

                // name
                Element nameElem = outDoc.createElement("name");
                nameElem.appendChild(outDoc.createTextNode(rs.getString("name")));
                studentElem.appendChild(nameElem);

                // phone
                Element phoneElem = outDoc.createElement("phone");
                phoneElem.appendChild(outDoc.createTextNode(rs.getString("phone")));
                studentElem.appendChild(phoneElem);

                // subject
                Element subjectElem = outDoc.createElement("subject");
                subjectElem.appendChild(outDoc.createTextNode(rs.getString("subject")));
                studentElem.appendChild(subjectElem);

                // student को root में जोड़ो
                rootElement.appendChild(studentElem);
            }

            rs.close();
            stmt.close();
            conn.close();

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(outDoc);
            StreamResult result = new StreamResult(new File("students.xml"));
            transformer.transform(source, result);

            System.out.println("XML File बन गया: students.xml");


  }catch(Exception e){
   e.printStackTrace();
  }
}
}