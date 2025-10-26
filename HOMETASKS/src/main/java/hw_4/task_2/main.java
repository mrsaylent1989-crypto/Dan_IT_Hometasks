package hw_4.task_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        String numb = scanner.next().trim();
        scanner.close();

        String rev = new StringBuilder(numb).reverse().toString();
        if (numb.equals(rev)) {
            System.out.println("Число є паліндромом.");
        } else {
            System.out.println("Число НЕ є паліндромом.");
        }
    }
}
