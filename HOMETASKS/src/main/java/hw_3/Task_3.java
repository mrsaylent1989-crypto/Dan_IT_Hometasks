package hw_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення 1");
        int a = scanner.nextInt();

        System.out.println("Введіть значення 2");
        int b = scanner.nextInt();

        int c = (a > b) ? (a - b) : (b - a);
        System.out.println(c);
    }
}

