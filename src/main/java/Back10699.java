import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Back10699 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
        System.out.println(formattedDate);
    }
}
