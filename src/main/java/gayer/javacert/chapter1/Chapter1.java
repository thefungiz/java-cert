package gayer.javacert.chapter1;

public class Chapter1 {

    public static void main(String[] args)
    {
        System.out.println("Going through passed arguments:" + args.length);
        for (String item : args){
            System.out.println(item);
        }

    }

}
