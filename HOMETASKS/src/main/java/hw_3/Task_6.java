package hw_3;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву програми (IntelliJ IDEA, Git, Java): ");
        String programInput = scanner.nextLine().trim();

        System.out.print("Введіть операційну систему (Linux, MacOS, Windows): ");
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
                        System.out.println("Такої ОС не існує: " + osInput);
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
                        System.out.println("Такої ОС не існує: " + osInput);
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
                        System.out.println("Такої ОС не існує: " + osInput);
                }
                break;

            default:
                System.out.println("Такої програми не існує: " + programInput);
        }

        if (link != null) {
            System.out.println("Посилання для завантаження:");
            System.out.println(link);
        }
        scanner.close();
    }
}
