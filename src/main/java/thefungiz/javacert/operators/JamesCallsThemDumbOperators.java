package thefungiz.javacert.operators;

public class JamesCallsThemDumbOperators { // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

    public static void main(String[] args) {
        System.out.println(true && false || true);
        System.out.println(true & false | true);
        System.out.println(false || true && false);
        System.out.println(false | true & false);
        System.out.println(2 * 4 + 16 * -(66 + -60) > 0 && true);
        System.out.println((double)+ - + - + - +2);
        System.out.println((float) - - - +2);
        System.out.println((Integer) 2 instanceof Number);
        System.out.println(new Integer(2) instanceof Number);
    }
}
