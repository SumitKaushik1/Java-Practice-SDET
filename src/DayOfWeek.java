import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println( LocalDate.of(2016,1,23).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase());
    }
}
