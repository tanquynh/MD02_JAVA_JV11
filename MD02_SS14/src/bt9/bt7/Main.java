package bt9.bt7;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024,01,29);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/DD");
        String date  = formatter.format(localDate);
        System.out.println("Ngay : " + date);
    }
}
