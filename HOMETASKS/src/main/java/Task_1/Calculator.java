package Task_1;

public class Calculator {
    public static int calculate(int a, int b, String action) {
        switch (action) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
        }
        return a;
    }
}
