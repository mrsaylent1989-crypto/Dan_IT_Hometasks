package hw_6_2.task_2;

public class main {
    public static void main(String[] args) {
        TextProcessor reverseProcessor = new ReverseProcessor();
        TextProcessor trimProcessor = new TrimProcessor();
        TextProcessor upperCaseProcessor = new UpperCaseProcessor();

        System.out.println(reverseProcessor.process("  Hello.dear.friends  "));
        System.out.println(reverseProcessor.removeDigits("  Hello.dear.friends  "));
        System.out.println("|----------------------------|");
        System.out.println(trimProcessor.process("  Hello.dear.friends  "));
        System.out.println(trimProcessor.removeDigits("  Hello.dear.friends  "));
        System.out.println("|----------------------------|");
        System.out.println(upperCaseProcessor.process("  Hello.dear.friends  "));
        System.out.println(upperCaseProcessor.removeDigits("  Hello.dear.friends  "));
    }
}
