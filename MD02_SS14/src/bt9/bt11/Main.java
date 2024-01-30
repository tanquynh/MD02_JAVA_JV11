package bt9.bt11;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Thêm hoặc bớt một số ngày, giờ, phút, giây hoặc mili giây vào một ngày hoặc thời gian nhập vào
        LocalDate localDate = LocalDate.now();
        LocalDate modifiedDate = localDate.plusDays(-5);
        System.out.println("localDate "+localDate);
        System.out.println("modifiedDate "+modifiedDate);

        LocalTime localTime = LocalTime.now();
        LocalTime modifiedTime = localTime.plusHours(1);
        System.out.println("localTime "+localTime);
        System.out.println("modifiedTime "+modifiedTime);
    }
}
