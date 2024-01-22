package ra.controller;

import ra.service.SingerService;

import java.util.Scanner;

public class SingerController {
    public static void displaySingerManagementMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------SINGER-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ \n" +
                    "3.Thay đổi thông tin ca sĩ theo mã id \n" +
                    "4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)\n" +
                    "5.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    SingerService.addSinger();
                    break;
                case 2 :
                    SingerService.displaySinger();
                    break;
                case 3:

                    SingerService.editSinger();
                    break;
                case 4 :
                    SingerService.deleteSinger();
                case 5: return;
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }
}
