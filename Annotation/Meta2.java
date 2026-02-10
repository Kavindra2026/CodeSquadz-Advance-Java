import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {

  String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "class", val = 99)

public class Meta2 {
  @What(description = "An annotation test method")
  @MyAnno(str = "method", val = 100)
  public static void myMeth() {
    Meta2 ob = new Meta2();
    try {
      Annotation annos[] = ob.getClass().getAnnotations();
      MyAnno mn = ob.getClass().getAnnotation(MyAnno.class);
      System.out.println(mn.getClass().getName());
      System.out.println(mn.str());
      System.out.println(mn.val());
      System.out.println("All annotations for Meta2:");
      for (int i = 0; i < annos.length; i++)
        System.out.println(annos[i]);
      System.out.println();

      Method m = ob.getClass().getMethod("myMeth");
      annos = m.getAnnotations();
      System.out.println("All annotations for myMeth:");
      for (int i = 0; i < annos.length; i++)
        System.out.println(annos[i]);

    } catch (NoSuchMethodException exc) {
      System.out.println("Method Not Found.");
    }
  }

  public static void main(String args[]) {
    myMeth();
  }
}
