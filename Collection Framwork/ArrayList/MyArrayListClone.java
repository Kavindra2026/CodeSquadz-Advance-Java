import java.util.ArrayList;

public class MyArrayListClone {
  public static void main(String[] args) {
    ArrayList<String> arr1 = new ArrayList<String>();

    arr1.add("First");
    arr1.add("Second");
    arr1.add("Thrid");
    arr1.add("Random");
    System.out.println("Actual Arraylist : " + arr1);
    ArrayList<String> copy = (ArrayList<String>) arr1.clone();
    System.out.println("Cloned ArrayList : " + copy);
    if (arr1.get(0) == copy.get(0)) {
      System.out.println("shallow");
    }
    if (arr1 != copy) {
      System.out.println("Clone");
    }

  }

}
