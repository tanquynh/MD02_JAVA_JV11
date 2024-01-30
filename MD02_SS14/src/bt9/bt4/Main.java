package bt9.bt4;

import java.time.LocalDate;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        // Bài tập 4: Viết chương trình để tính toán số ngày trong tháng hiện tại.
        YearMonth yearMonth = YearMonth.now();
        int day = yearMonth.lengthOfMonth();
        System.out.println("So ngay :" + day);
    }
}
