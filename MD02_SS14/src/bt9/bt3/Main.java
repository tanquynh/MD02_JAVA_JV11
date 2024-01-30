package bt9.bt3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019,05,19);
        LocalDate localDate1 = LocalDate.now();
        long dayBetween = ChronoUnit.DAYS.between(localDate,localDate1);
        long mouthBetween = ChronoUnit.MONTHS.between(localDate,localDate1);
        long yearBetween = ChronoUnit.YEARS.between(localDate,localDate1);
        System.out.println("Ngay : "+ dayBetween);
        System.out.println("Thang : " + mouthBetween);
        System.out.println("Nam : " + yearBetween);
    }
}
