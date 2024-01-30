package bt9.bt8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Bài tập 8: Chuyển đổi một đối tượng LocalDateTime sang một chuỗi ngày (dd/MM/yyyy HH:mm:ss)
        LocalDateTime localDate = LocalDateTime.of(2024,1,29,10,30,20);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy/ hh:mm:ss");
        String datetime = formatter.format(localDate);
        System.out.println(datetime);
    }
}
