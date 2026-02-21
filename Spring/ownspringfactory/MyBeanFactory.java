import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

interface MyBeanFactory {
    public Object myGetBean(String id_Name) throws Exception;
}