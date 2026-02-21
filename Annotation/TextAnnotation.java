
class TestDeprecated {
  @Deprecated
  static void display() {
    System.out.println("display");
  }
}

public class TextAnnotation {
  public static void main(String[] args) {
    new TextAnnotation().doSomeTestNow();
  }

  @SuppressWarnings({ "checked", "deprecation" })
  public void doSomeTestNow() {
    TestDeprecated.display();
  }
}
