package java_hm_2;

public class hw_3 {
    public static void main(String[] args) {

        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        text = text.toLowerCase();
        String[] parts = text.split("a");
        int count = parts.length - 1;

        System.out.println(count);
    }
}
