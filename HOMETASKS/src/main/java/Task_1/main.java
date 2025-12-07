package Task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("Enter 2 numbers and the operation (+, -, *, /)");
                System.out.print("First number: ");
                int a = sc.nextInt();
                System.out.print("Second number: ");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.print("Operation: ");
                String action = sc.nextLine().trim();

                int result = Calculator.calculate(a, b, action);
                System.out.println("Result: " + result);

            } catch (ArithmeticException ex) {
                System.out.println("Error: division by zero!");
                ex.printStackTrace();
            } catch (InputMismatchException ex) {
                System.out.println("Error: You entered an invalid number!");
                sc.nextLine();
                ex.printStackTrace();
            } catch (Exception ex) {
                System.out.println("Unknown error!");
                ex.printStackTrace();
            }

            System.out.print("Do you want to continue? (y/n): ");
            String again = sc.nextLine();

            if (!again.equals("y")) {
                running = false;
            }
        }
        System.out.println("The program is completed.");
        sc.close();
    }
}
