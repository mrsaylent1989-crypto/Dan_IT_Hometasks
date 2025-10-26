package hw_4.task_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводьте слова, або введіть STOP щоб завершити:");
        StringBuilder words = new StringBuilder();
        while (true) {
            String word = scanner.next();
            if ("STOP".equals(word)) break;
            if (words.length() > 0) words.append(" ");
            words.append(word);
        }
        if (words.length() == 0) {
            System.out.println("слова не введені");
        } else {
            System.out.println("ваше речення");
            System.out.println(words.toString());
        }
        scanner.close();
    }
}