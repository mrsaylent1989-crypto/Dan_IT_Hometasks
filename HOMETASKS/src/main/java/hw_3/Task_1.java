package hw_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you like to do?");

        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        String fourth = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third.replace(".", " "));
        System.out.println(fourth);


    }
}

