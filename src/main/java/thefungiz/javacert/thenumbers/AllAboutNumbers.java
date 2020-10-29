package thefungiz.javacert.thenumbers;

public class AllAboutNumbers {

    public static void main(String[] args) {
//        println("Here's some info on numbers");
//        println("The floating types:");
//        printNumberInfo(Float.class, Float.MIN_VALUE, Float.MAX_VALUE);
//        printNumberInfo(Double.class, Double.MIN_VALUE, Double.MAX_VALUE);
//        println("The integer types:");
//        printNumberInfo(Byte.class, Byte.MIN_VALUE, Byte.MAX_VALUE);
//        printNumberInfo(Short.class, Short.MIN_VALUE, Short.MAX_VALUE);
//        printNumberInfo(Integer.class, Integer.MIN_VALUE, Integer.MAX_VALUE);
//        printNumberInfo(Long.class, Long.MIN_VALUE, Long.MAX_VALUE);

//        doingBytes();

//        whatIf();
//        printAllChars();
    }

    private static void doingBytes() {
//        byte it = 0b00000000;
//        for (int i = 0; i < 256; i++) {
//            it += (byte)0b00000001;
//            println(it);
//        }
//        println((byte)0b10000001);
    }

    private static void whatIf() {
        println("What if you go overboard?");
        println("let's see");
//        println((byte)-1 + 0b00000001); // 0b11111111 + 0b00000001 = ?
        println("Byte.MAX_VALUE + 1 = " + (byte)(Byte.MAX_VALUE + 1)); // https://stackoverflow.com/questions/5193883/how-do-you-specify-a-byte-literal-in-java
    }

    private static void printAllChars() {
        println("");
        println("Here's some info on chars");
        for (char i = 0; i < Character.MAX_VALUE; i = (char)((byte)i + 0b00000001)) {
            println((byte)i + ": " + i);
        }
    }

    private static void printNumberInfo(Class<? extends Number> numberClass, Object min, Object max) {
        println(numberClass.getSimpleName() + " min: " + min);
        println(numberClass.getSimpleName() + " max: " + max);
        println("");
    }

    private static void println(Object it) {
        System.out.println(it);
    }
}
