package java_hm_2;

public class hw_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        string = string.replace(",", "");

        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            System.out.println("Слово " + (i + 1) + " — \"" + word + "\", довжина цього слова: " + length);
        }

        int firstWordLength = words[0].length();
        boolean isFirstLongest = true;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= firstWordLength) {
                isFirstLongest = false;
                break;
            }
        }

        System.out.println(isFirstLongest);
    }
}
