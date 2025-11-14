package hw_5;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private final String name;
    private final int gameNumber;

    public NumbersApplication(String name){
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }
    public void startGame(Scanner scanner){
        System.out.println("Let the game begin!");
        System.out.println("I have chosen a number between 0 and 100. Try to guess it.");
        int attempts = 0;
        while (true) {
            System.out.println("Enter your guess: ");
            if (!scanner.hasNextInt()){
                System.out.println("Error! enter whole number");
                scanner.nextLine();
                continue;
            }
            int guess = scanner.nextInt();
            scanner.nextLine();
            attempts++;

            if(guess<gameNumber){
                System.out.println("Your number is too small, try again!");
            } else if(guess>gameNumber){
                System.out.println("Your number is too big, try again!");
            }else{
             System.out.println("Congratulations! "+ name );
             break;
            }
        }
    }
}
