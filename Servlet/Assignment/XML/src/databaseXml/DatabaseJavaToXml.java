package databaseXml;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DatabaseJavaToXml {
    public static void main(String[] args) {
        try {

            InputStream is = DatabaseJavaToXml.class
                    .getClassLoader()
                    .getResourceAsStream("Database.xml");
            if (is == null) {
                throw new RuntimeException("Cannot find Database.xml in classpath");
            }

  
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(is);
            doc.getDocumentElement().normalize();

           //connect xml file
            String driver = doc.getElementsByTagName("driver").item(0).getTextContent();
            String url = doc.getElementsByTagName("url").item(0).getTextContent();
            String username = doc.getElementsByTagName("username").item(0).getTextContent();
            String password = doc.getElementsByTagName("password").item(0).getTextContent();

            
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);

            // read file database
            String sql = "SELECT id, name, phone, subject FROM student1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // new output file
            Document outDoc = dBuilder.newDocument();
            Element rootElement = outDoc.createElement("Database");
            outDoc.appendChild(rootElement);

            while (rs.next()) {
                Element studentElem = outDoc.createElement("student");

                Element idElem = outDoc.createElement("id");
                idElem.appendChild(outDoc.createTextNode(String.valueOf(rs.getInt("id"))));
                studentElem.appendChild(idElem);

                Element nameElem = outDoc.createElement("name");
                nameElem.appendChild(outDoc.createTextNode(rs.getString("name")));
                studentElem.appendChild(nameElem);

                Element phoneElem = outDoc.createElement("phone");
                phoneElem.appendChild(outDoc.createTextNode(rs.getString("phone")));
                studentElem.appendChild(phoneElem);

                Element subjectElem = outDoc.createElement("subject");
                subjectElem.appendChild(outDoc.createTextNode(rs.getString("subject")));
                studentElem.appendChild(subjectElem);

                rootElement.appendChild(studentElem);
            }

            rs.close();
            stmt.close();
            conn.close();

            // write file in XML document
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            DOMSource source = new DOMSource(outDoc);
            StreamResult result = new StreamResult("UpdatedDatabase.xml");

            transformer.transform(source, result);

            System.out.println("XML File : Database.xml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
