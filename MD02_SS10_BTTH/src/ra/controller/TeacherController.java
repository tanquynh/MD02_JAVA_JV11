package ra.controller;

import ra.service.TeacherService;

import java.util.Scanner;



public class TeacherController {
    TeacherService teacherService = new TeacherService();
    public void displayTeacherManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------TEACHER-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng giáo viên cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả giáo viên đã lưu trữ \n" +
                    "3.Thay đổi thông tin thông tinh giáo viên theo mã id \n" +
                    "4.Thay đổi trạng thái giao viên \n" +
                    "5.Tìm kiếm theo tên giáo viên \n" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    teacherService.addTeacher();
                    break;
                case 2 :
                    teacherService.displayTeacherAll();
                    break;
                case 3:
                    teacherService.editTeacher();
                    break;
                case 4 :
                    teacherService.editTeacherStatus();
                    break;
                case 5:
                    teacherService.searchTeacherByName();
                case 6 :
                    return;
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }
}
