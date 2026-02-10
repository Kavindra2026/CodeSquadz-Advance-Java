import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str() default "Testing";

  int val() default 900;

}







public class DefaultValue {
  @MyAnno()
  public static void myMeth() {
    DefaultValue ob = new DefaultValue();
    try {
      Class c = ob.getClass();
      Method m = c.getMethod("MyAnno");
      MyAnno anno = m.getAnnotation(MyAnno.class);
      System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException exc) {
      System.out.println("Method  ot Found ");
    }
  }

  public static void main(String[] args) {
    myMeth();
  }

}