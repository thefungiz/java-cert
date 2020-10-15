package thefungiz.javacert;

public class OperatorShortCircuit {

  public static void main(String[] args) {

    System.out.println("First: " + (returnFalse("1") || returnTrue("2") && returnFalse("3")));
    System.out.println("Second: " + (returnTrue("1") & returnTrue("2")));



//    System.out.println(true || false && true);    // true
//    System.out.println(false || true && true);    // true
//    System.out.println(true || true && true);     // true
//    System.out.println(false || false && true);   // false
//    System.out.println(true || false && false);   // true
//    System.out.println(false || true && false);   // false <-- current use case
//    System.out.println(true || true && false);    // true
//    System.out.println(false || false && false);  // false
//    //
//    System.out.println(true && false || true);    // true
//    System.out.println(false && true || true);    // true
//    System.out.println(true && true || true);     // true
//    System.out.println(false && false || true);   // true
//    System.out.println(true && false || false);   // false
//    System.out.println(false && true || false);   // false
//    System.out.println(false && true || false);   // false
//    System.out.println(true && true || false);    // true
//    System.out.println(false && false || false);  // false
  }


  private static boolean returnTrue(String name) {
    System.out.println("returning true" + name);
    return true;
  }

  private static boolean returnFalse(String name) {
    System.out.println("returning false" + name);
    return false;
  }


}
