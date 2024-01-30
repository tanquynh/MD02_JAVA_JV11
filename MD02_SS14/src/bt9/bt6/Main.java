package bt9.bt6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String date = "2024-01-29";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("Ngay chuyen doi : " + localDate );
    }
}
