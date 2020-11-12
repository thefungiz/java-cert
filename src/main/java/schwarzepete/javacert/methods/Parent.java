package schwarzepete.javacert.methods;

import schwarzepete.javacert.constructors.Shape;

public class Parent {


    public void printName(){
        //this does nothing
    }

    protected void printName(String firstName) throws Exception {
        if(firstName.isEmpty())
            throw new Exception();
        System.out.println(firstName);
    }

    protected void printName(String firstName, String lastName) throws RuntimeException{
        System.out.println(firstName);
        System.out.println(lastName);
    }

    public Shape doSomething(){
        return new Shape();
    }
}
