package hw_6_2.task_2;

public class TrimProcessor implements TextProcessor{

    @Override
    public String process(String text) {
        return text.trim();
    }

    @Override
    public String removeDigits(String text) {
        return TextProcessor.super.removeDigits(text);
    }
}
