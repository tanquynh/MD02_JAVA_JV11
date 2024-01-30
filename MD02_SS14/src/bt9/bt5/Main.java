package bt9.bt5;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Year year = Year.now();
        int dayOfyear = year.length();
        System.out.println("DayOfYear : "+ dayOfyear);
    }
}
