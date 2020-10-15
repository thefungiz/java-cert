package thefungiz.javacert.operators;

import static java.lang.Integer.*;

public class JamesCallsThemDumbOperators { // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

    public static void main(String[] args) {
//        System.out.println(true && false || true); // true
//        System.out.println(true & false | true);  // true
//        System.out.println(false || true && false); // false
//        System.out.println(false | true & false); // false
//        System.out.println(2 * 4 + 16 * -(66 + -60) > 0 && true); // false
//        System.out.println((double) - + - + - +2); // -2.0
//        System.out.println((float) - - - +2); // -2.0
        System.out.println((Integer) 2 instanceof Number); // true
        System.out.println(((Integer)2) instanceof Number);
    }
}
