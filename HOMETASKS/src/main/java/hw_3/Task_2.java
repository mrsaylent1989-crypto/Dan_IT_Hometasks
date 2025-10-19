package hw_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення 1");
        int a = scanner.nextInt();

        System.out.println("Введіть значення 2");
        int b = scanner.nextInt();

        System.out.println("Введіть значення 3");
        int c = scanner.nextInt();

        boolean result = (a + b > c) || (b + c > a) || (a + c > b);
        System.out.println(result + " " + "Можна побудувати трикутник");
    }
}
