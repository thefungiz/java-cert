import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
    System.out.println("What would you say to Pink?");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println(input + ", Pink!!");
  }
}
