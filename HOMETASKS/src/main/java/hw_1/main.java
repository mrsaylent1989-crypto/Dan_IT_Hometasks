package hw_1;

public class main {
    public static void main(String[] args) {
        int firstValue = 7;
        int secondValue = 9;

        System.out.println(firstValue);
        System.out.println(secondValue);

        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;
        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}
