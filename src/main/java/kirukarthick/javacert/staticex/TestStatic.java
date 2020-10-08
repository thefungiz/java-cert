package kirukarthick.javacert.staticex;

public class TestStatic {
    static String msg; //make this non static and test
    static int diappy = 5;
    String name = "kiara";

    TestStatic() {
        diappy = diappy + 4;
        System.out.println(diappy);
    }

    static void kiki1() {
        System.out.println("Mommy!!");
    }

    static {
        msg = "Kiara is crying";
        diappy = diappy - 2;
    }

    // Make this method non static and test
    static void kiki2() {
        System.out.println("Its time to change my Diapers ");
        diappy = diappy + 1;
    }

    public static void main(String[] args) {
        System.out.println(msg);  //value for msg ==??
        kiki1();
        kiki2();
        //System.out.println(name);cannot access a non static member
        System.out.println(diappy);
      /*
        TestStatic ts1 = new TestStatic();
        ts1.kiki2();
        System.out.println(diappy);
       */

        TestStatic.display ts2 = new TestStatic.display();
        ts2.nameDisplay();
        //TestStatic.display.nameDisplay(); possible if method is also static
        TestStatic ts3 = new TestStatic();
        TestStatic.display1 ds1 = ts3.new display1();
        ds1.nameDisplay();



    }

    public static class display {
        public void nameDisplay() {
            System.out.println("test");
            //System.out.println(name); cannot access non-static member from outer class
        }
    }

    // Non-static nested class
    public class display1 {
        public void nameDisplay() {
            System.out.println(name);
            //System.out.println(msg); can access both static and non-static members from the outer class
        }
    }
}
