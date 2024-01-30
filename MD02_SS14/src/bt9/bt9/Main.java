package bt9.bt9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //So sánh hai ngày LocalDate (trả về int)
        LocalDate localDate1 = LocalDate.of(2024,1,29);
        LocalDate localDate2 = LocalDate.of(2023,12,29);
        int date = localDate2.compareTo(localDate1);
        System.out.println(date);
    }
}
