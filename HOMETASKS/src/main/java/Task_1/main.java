package Task_1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
        public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek dow = dateTime.getDayOfWeek();
        return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
    }
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }
    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long days = duration.toDays();
        duration = duration.minusDays(days);
        long hours = duration.toHours();
        duration = duration.minusHours(hours);
        long minutes = duration.toMinutes();
        return "Difference: " + days + " days, " + hours + " hours, " + minutes + " minutes";
    }
    public static void main(String[] args) {

        System.out.println("1) Current date and time: " + getCurrentDateTime());

        LocalDateTime base = LocalDateTime.of(2023, 10, 25, 14, 30);
        System.out.println("2) calculateFutureDateTime: " + calculateFutureDateTime(base, 3, 5));

        System.out.println("3) isWeekend (28.10.2023): " +
                isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0)));

        System.out.println("3) isWeekend (30.10.2023): " +
                isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0)));

        System.out.println("4) formatDateTime: " +
                formatDateTime(base, "dd-MM-yyyy HH:mm"));

        LocalDateTime a = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime b = LocalDateTime.of(2023, 10, 28, 16, 45);
        System.out.println("5) " + calculateDifference(a, b));
    }
}

