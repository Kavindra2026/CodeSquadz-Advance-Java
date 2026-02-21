import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class MyXmlBeanFactory implements MyBeanFactory {
    Class c;
    Element chapter;
    NodeList beanId, pojoclass;
    Text refVariable, loadedClass;
    String spBean, sobj, sRef;

    public MyXmlBeanFactory(String xml) {
        try {
            DocumentBuilderFactory fact1 = DocumentBuilderFactory.newInstance();
            fact1.setValidating(true);
            fact1.setIgnoringElementContentWhitespace(true);
            DocumentBuilder build1 = fact1.newDocumentBuilder();
            spBean = xml;
            Document bookdoc = build1.parse(new File(spBean));
            Element bookele = bookdoc.getDocumentElement();
            NodeList chapternodes = bookele.getChildNodes();
            
            for (int i = 0; i < chapternodes.getLength(); i++) {
                chapter = (Element) chapternodes.item(i);
                
                beanId = chapter.getElementsByTagName("Bean_id");
                refVariable = (Text) beanId.item(0).getFirstChild();
                sRef = refVariable.getWholeText();

                pojoclass = chapter.getElementsByTagName("Bean_Class_Name");
                pojoclass = chapter.getElementsByTagName("Bean_Class_Name");
                loadedClass = (Text) pojoclass.item(0).getFirstChild();
                sobj = loadedClass.getWholeText();
            }
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public Object myGetBean(String id_Name) throws Exception {
        if (id_Name.equals(sRef)) {
            c = Class.forName(sobj);
            Object c1 = (Object) c.newInstance();
            return c1;
        }
        return null; // Implied return for compilation if no match
    }
}
