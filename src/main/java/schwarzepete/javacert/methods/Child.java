package schwarzepete.javacert.methods;

import schwarzepete.javacert.constructors.Shape;
import schwarzepete.javacert.constructors.Square;

public class Child extends Parent {

    private void printName(String firstName, String lastName, String parentName) throws Exception{
        System.out.println(new StringBuilder(firstName).append(" ").append(lastName).append(" ").append(parentName).toString());
    }

    @Override
    public void printName(String firstName) {

    }

    @Override
    public void printName(String firstName, String lastName) throws ArithmeticException{

    }

    @Override
    public Square doSomething() {
        return new Square();
    }
}
