package Task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {
    private Map<String, Person> people = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new main().run();
    }

    private void run() {
        System.out.println("Welcome. Commands: add, get, list, exit");
        while (true) {
            System.out.print("\nEnter the command: ");
            String cmd = sc.nextLine().trim();
            if (cmd.equalsIgnoreCase("exit")) {
                System.out.println("The program has finished running. Goodbye!");
                break;
            } else if (cmd.equalsIgnoreCase("add")) {
                addPerson();
            } else if (cmd.equalsIgnoreCase("get")) {
                getPerson();
            } else if (cmd.equalsIgnoreCase("list")) {
                listPeople();
            } else if (cmd.isEmpty()) {
            } else {
                System.out.println("Unknown command. Available commands: add, get, list, exit");
            }
        }
    }

    private void addPerson() {
        System.out.print("Enter your last name (surname): ");
        String surname = sc.nextLine().trim();
        if (surname.isEmpty()) {
            System.out.println("The last name cannot be empty. Operation canceled.");
            return;
        }
        System.out.print("Enter your name (name): ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("The name cannot be empty. Operation canceled.");
            return;
        }

        Integer age = null;
        while (age == null) {
            System.out.print("Enter age (integer): ");
            String ageStr = sc.nextLine().trim();
            try {
                age = Integer.parseInt(ageStr);
                if (age < 0) {
                    System.out.println("Age cannot be negative. Please try again.");
                    age = null;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: You must enter an integer. Please try again.");
            }
        }

        String key = surname.toUpperCase();
        if (people.containsKey(key)) {
            System.out.println("A person with this surname already exists: " + people.get(key));
            System.out.print("Replace entry? (yes/no): ");
            String answer = sc.nextLine().trim();
            if (answer.equalsIgnoreCase("yes")) {
                people.put(key, new Person(name, surname, age));
                System.out.println("Information updated.");
            } else {
                System.out.println("The information has not been updated.");
            }
        } else {
            people.put(key, new Person(name, surname, age));
            System.out.println("Person added.");
        }
    }

    private void getPerson() {
        System.out.print("Enter a last name to search: ");
        String surname = sc.nextLine().trim();
        if (surname.isEmpty()) {
            System.out.println("Last name is empty. Operation canceled.");
            return;
        }
        String key = surname.toUpperCase();
        if (people.containsKey(key)) {
            Person p = people.get(key);
            System.out.println("Record found: " + p);
        } else {
            if (people.isEmpty()) {
                System.out.println("The list is empty.");
            } else {
                System.out.println("No records found with the entered surname.");
                System.out.println("Available surnames:");
                printAvailableSurnames();
            }
        }
    }

    private void listPeople() {
        if (people.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("List of people:");
        for (Person p : people.values()) {
            System.out.println(" - " + p);
        }
    }

    private void printAvailableSurnames() {
        Set<String> keys = people.keySet();
        for (String k : keys) {
            Person p = people.get(k);
            System.out.println("  * " + p.getSurname());
        }
    }
}
