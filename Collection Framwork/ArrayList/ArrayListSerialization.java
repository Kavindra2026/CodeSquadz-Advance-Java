import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ArrayListSerialization {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();

    al.add("Helo");
    al.add("Hi");
    al.add("Howdy");

    try {
      FileOutputStream fos = new FileOutputStream("myfile");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(al);
      oos.close();
      fos.close();
      System.out.println("after Deserialization");
      FileInputStream fin = new FileInputStream("myfile");
      ObjectInputStream oin = new ObjectInputStream(fin);
      ArrayList all = (ArrayList) oin.readObject();
      System.out.println(all);

    } catch (Exception ioe) {
      ioe.printStackTrace();
    }

  }

}
