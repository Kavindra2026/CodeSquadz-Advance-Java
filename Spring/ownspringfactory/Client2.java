import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Client2 {
    public static void main(String sa[]) throws Exception {
        MyBeanFactory mf = new MyXmlBeanFactory("Beans.xml");
        Student e = (Student) mf.myGetBean("refId");
        
        e.setRoll(10);
        e.setName("Ankur");
        e.setAddress("Delhi");
        
        System.out.println(e.getRoll());
        System.out.println(e.getName());
        System.out.println(e.getAddress());
    }
}