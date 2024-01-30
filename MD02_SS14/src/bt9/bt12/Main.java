package bt9.bt12;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Bài tập 12: Tính toán ngày (LocalDate) tiếp theo hoặc ngày trước đó của một ngày
        LocalDate localDate = LocalDate.now();
        LocalDate modifuedDate = localDate.plusDays(1);
        System.out.println("Next day : " + modifuedDate);
        LocalDate backDay = localDate.minusDays(1);
        System.out.println("Last day : " + backDay);

    }
}
