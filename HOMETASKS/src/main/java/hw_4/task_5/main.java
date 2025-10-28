package hw_4.task_5;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random any = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = any.nextInt();
        }
        System.out.println("array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number: ");
        int number = sc.nextInt();

        boolean found = false;
        for (int value : array) {
            if (value == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("array have this number.");
        } else {
            System.out.println("array not have this number.");
        }

        sc.close();
    }
}
