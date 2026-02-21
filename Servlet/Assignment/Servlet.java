import java.sql.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Servlet {

  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/restful_db";
  private static final String DB_USER = "root";
  private static final String DB_PASS = "root";
  private static final String SELECT_QUERY = "SELECT id, name, email FROM client"; // change table/cols
  private static final String OUTPUT_FILE = "output.xml";

  public static void main(String[] args) {
    try {
      exportQueryToXML(SELECT_QUERY, OUTPUT_FILE);
      System.out.println("XML file generated: " + OUTPUT_FILE);
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public static void exportQueryToXML(String query, String outputPath)
      throws SQLException, ParserConfigurationException, TransformerException {

    try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery()) {

      ResultSetMetaData meta = rs.getMetaData();
      int colCount = meta.getColumnCount();

      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.newDocument();

      Element rootElement = doc.createElement("rows");
      doc.appendChild(rootElement);

      while (rs.next()) {
        Element row = doc.createElement("row");
        rootElement.appendChild(row);

        for (int i = 1; i <= colCount; i++) {
          String colName = meta.getColumnLabel(i);
          Object value = rs.getObject(i);
          Element colElement = doc.createElement(sanitizeXmlName(colName));
          colElement.appendChild(doc.createTextNode(value == null ? "" : value.toString()));
          row.appendChild(colElement);
        }
      }

      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();

      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new File(outputPath));
      transformer.transform(source, result);
    }
  }

  private static String sanitizeXmlName(String name) {
    if (name == null || name.isEmpty())
      return "col";

    String s = name.trim().replaceAll("[^A-Za-z0-9\\-.:]", "");
    if (!s.matches("^[A-Za-z_].*")) {
      s = "_" + s;
    }
    return s;
  }
}