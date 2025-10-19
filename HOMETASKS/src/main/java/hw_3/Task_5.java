package hw_3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        if (!scanner.hasNextDouble()) {
            System.out.println(0);
            return;
        }
        double a = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        if (!scanner.hasNextDouble()) {
            System.out.println(0);
            return;
        }
        double b = scanner.nextDouble();

        System.out.print("Введіть операцію (+, %, /, *): ");
        String op = scanner.next();
        char c = op.length() > 0 ? op.charAt(0) : ' ';


        double result = (c == '+') ? (a + b)
                : (c == '-') ? (a - b)
                : (c == '*') ? (a * b)
                : (c == '/') ? (b == 0 ? 0.0 : a / b)
                : (c == '%') ? (b == 0 ? 0.0 : a % b)
                : 0.0;
        System.out.println(result);
    }
}
