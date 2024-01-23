package ra.run;

import ra.controller.SingerController;
import ra.controller.SongController;

import java.util.Scanner;

public class MusicManagenment {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------MUSIC-MANAGEMENT----------------");
            System.out.println("1. Quản lý ca sĩ \n" +
                    "2. Quản lý bài hát \n" +
                    "3. Tìm kiếm bài hát \n" +
                    "4. Thoát ");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:  SingerController.displaySingerManagementMenu();
                break;
                case 2 :
                    SongController.displaySongManagementMenu();
                    break;
            }
        }
    }
}
