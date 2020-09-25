package kirukarthick.javacert.simpleprogram;

import java.util.Scanner;

public class SimplePgm {
    public static void main (String[] args)
    {
      System.out.println("ASCII values");
        Scanner as = new Scanner(System.in);
        char ch = as.next().charAt(0); // there is no nextchar()
        int ascii = ch; // implicit type casting
        System.out.println("Ascii Value of "+"'"+ch+"' is "+ascii);
        }
}
