package hw_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Що ви полюбляете робити?");

        String first = scanner.next();
        String Second = scanner.next();
        String Third = scanner.next();
        String Fourth = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println(first);
        System.out.println(Second);
        System.out.println(Third.replace(".", " "));
        System.out.println(Fourth);


    }
}

