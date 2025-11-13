package hw_3;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value ");
        int a = scanner.nextInt();
        if (a == 1) {
            answer("Monday");
        } else if (a == 2) {
            answer("Tuesday");
        } else if (a == 3) {
            answer("Wednesday");
        } else if (a == 4) {
            answer("Thursday");
        } else if (a == 5) {
            answer("Friday");
        } else if (a == 6) {
            answer("Saturday");
        } else if (a == 7) {
            answer("Sunday");
        } else answer("I wish today were Friday.");

        System.out.println(a);
    }

    public static void answer(String toAnswer) {
        System.out.println(toAnswer);
    }
}

