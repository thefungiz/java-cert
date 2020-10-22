package gayer.javacert.masonjar.avatar;

import java.util.Scanner;

public class AvatarState {

    public static void main(String[] args){
        System.out.println("Water");
        System.out.println("Earth");
        System.out.println("Fire");
        System.out.println("Air");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Only the Avatar can control all four elements....");
    }
}
