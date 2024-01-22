package ra.controller;

import ra.service.SingerService;
import ra.service.SongService;

import java.util.Scanner;

public class SongController {
    public static void displaySongManagementMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------SINGER-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả bài hát đã lưu trữ \n" +
                    "3.Thay đổi thông tin bài hát theo mã id \n" +
                    "4.Xóa bài hát theo mã id\n" +
                    "5.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    SongService.addSong();
                    break;
                case 2 :
                    SongService.displaySong();
                    break;
                case 3:

                    SongService.editSong();
                    break;
                case 4 :
                    SongService.deleteSong();
                case 5: return;
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }
}
