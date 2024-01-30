package bt9.bt1;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        // Bài tập 1: Viết chương trình để lấy ngày hiện tại của hệ thống và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
       // lay ngay hien tai
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // lay ngya tokyo
        ZonedDateTime tokyoDate = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoDate);
        // lay Australia/Sydney
        ZonedDateTime australiaDate = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(australiaDate );
        ZonedDateTime america = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(america);
    }
}
