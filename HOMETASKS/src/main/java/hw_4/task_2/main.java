package hw_4.task_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String numb = scanner.next().trim();
        scanner.close();

        String rev = new StringBuilder(numb).reverse().toString();
        if (numb.equals(rev)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is NOT a palindrome.");
        }
    }
}
