package gayer.javacert.smoothoperator;

import gayer.javacert.util.Header;

public class judicialPrecedence {


    public static void main(String[] args){
        Header head = new Header("judicialPrecedence");
        exercise1();
        exercise1A();
        exercise2();
        exercise3();
        exercise4();

    }

    //https://introcs.cs.princeton.edu/java/11precedence/
    private static void exercise1(){
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println("exercise1: " + z);
        System.out.println("Unassigned: ");
       // System.out.println(++x * y--);
    }

    private static void exercise1A(){
        int x = 5;
        int y = 10;
        System.out.println("exercise1.a: ");
        System.out.println(++x * y--);
    }

    private static void exercise2(){
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));
    }

    private static void exercise3(){
        int year = 1996;
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println("parens");
        System.out.println(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    private static void exercise4(){
        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + 1 + 2);
    }

}
