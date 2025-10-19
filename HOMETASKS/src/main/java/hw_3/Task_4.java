package hw_3;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення ");
        int a = scanner.nextInt();
            if(a == 1) {
                answer("Понеділок");
            }else if(a == 2){
                answer("Вівторок");
            }else if(a == 3){
                answer("Середовище");
            }else if(a == 4){
                answer("Четвер");
            }else if(a == 5){
                answer("П'ятниця");
            }else if(a == 6){
                answer("Субота");
            }else if(a == 7){
                answer("Неділя");
            }else answer("Краще б сьогодні була п'ятниця");

            System.out.println(a);
    }
    public static void answer (String toAnswer){
        System.out.println(toAnswer);
    }
}

