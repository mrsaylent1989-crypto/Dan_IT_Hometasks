package hw_3;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the program (IntelliJ IDEA, Git, Java): ");
        String programInput = scanner.nextLine().trim();

        System.out.print("Enter the operating system (Linux, MacOS, Windows): ");
        String osInput = scanner.nextLine().trim();

        String program = programInput.toLowerCase();
        String os = osInput.toLowerCase();

        String link = null;

        switch (program) {
            case "intellij idea":
                switch (os) {
                    case "linux":
                        link = "https://www.jetbrains.com/ru-ru/idea/download/?section=linux";
                        break;
                    case "mac os":
                        link = "https://www.jetbrains.com/ru-ru/idea/download/?section=mac";
                        break;
                    case "windows":
                        link = "https://www.jetbrains.com/ru-ru/idea/download/?section=windows";
                        break;
                    default:
                        System.out.println("Such an OS does not exist: " + osInput);
                }
                break;

            case "git":
                switch (os) {
                    case "linux":
                        link = "https://git-scm.com/downloads/linux";
                        break;
                    case "mac os":
                        link = "https://git-scm.com/downloads/mac";
                        break;
                    case "windows":
                        link = "https://git-scm.com/downloads/win";
                        break;
                    default:
                        System.out.println("Such an OS does not exist: " + osInput);
                }
                break;

            case "java":
                switch (os) {
                    case "linux":
                        link = "https://www.java.com/ru/download/manual.jsp";
                        break;
                    case "mac os":
                        link = "https://www.java.com/ru/download/manual.jsp";
                        break;
                    case "windows":
                        link = "https://www.java.com/ru/download/manual.jsp";
                        break;
                    default:
                        System.out.println("Such an OS does not exist: " + osInput);
                }
                break;

            default:
                System.out.println("There is no such program: " + programInput);
        }

        if (link != null) {
            System.out.println("Download link:");
            System.out.println(link);
        }
        scanner.close();
    }
}
