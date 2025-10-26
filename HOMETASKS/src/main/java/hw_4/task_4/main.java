package hw_4.task_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       String[] names = {"Petya", "Masha", "Lena", "Fedya", "Sasha", "Anton", "Gleb"};
       int[] times = {10,12,14,16,18,20};
       String[] places = {"School", "Shop", "Crunch", "Gym", "Cinema", "Hospital"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        System.out.println("first - name(0.." + (names.length -1) + ")");
        System.out.println("Second - time(0.." + (times.length -1) + ")");
        System.out.println("Third - place(0.." + (places.length -1) + ")");

        int Name = scanner.nextInt();
        int Time = scanner.nextInt();
        int Place = scanner.nextInt();

        if (Name < 0 || Name >= names.length || Time < 0 || Time >= times.length || Place < 0 || Place >= places.length){
            System.out.println("Error: your number is outside the range");
        }else {
            String name = names[Name];
            int time = times[Time];
            String place = places[Place];
            System.out.println(name + " " + "goes to the" + " " + place + " " + "at" + " " + time + ":00");
        }
        scanner.close();
    }
}
