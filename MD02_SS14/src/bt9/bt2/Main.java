package bt9.bt2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        Bài tập 2: Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
        LocalTime localTime = LocalTime.now();
        System.out.println("Ngay gio hien tai " + localTime);
    }
}
