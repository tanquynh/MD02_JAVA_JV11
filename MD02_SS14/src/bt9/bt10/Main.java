package bt9.bt10;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //So sánh hai thời gian LocalTime
        LocalTime localTime = LocalTime.of(10,29,19);
        LocalTime localTime1 = LocalTime.of(8,12,29);
        int time = localTime.compareTo(localTime1);
        System.out.println(time);
    }
}
