package hw_4.task_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words, or enter STOP to finish:");
        StringBuilder words = new StringBuilder();
        while (true) {
            String word = scanner.next();
            if ("STOP".equals(word)) break;
            if (words.length() > 0) words.append(" ");
            words.append(word);
        }
        if (words.length() == 0) {
            System.out.println("words not entered");
        } else {
            System.out.println("your sentence");
            System.out.println(words.toString());
        }
        scanner.close();
    }
}