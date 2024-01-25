package ra.controller;




import ra.service.StudentService;

import java.util.Scanner;

public class StudentController {
      StudentService studentService = new StudentService();

    public void displayStudentManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------STUDENT-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng học sinh cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả học sinh đã lưu trữ \n" +
                    "3.Thay đổi thông tin thông tinh học sinh theo mã id \n" +
                    "4.Thay đổi trạng thái học sinh \n" +
                    "5.Tìm kiếm theo tên học sinh \n" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2 :
                    studentService.displayStudentAll();
                    break;
                case 3:
                    studentService.editStudent();
                    break;
                case 4 :
                    studentService.editStudentStatus();
                        break;
                case 5:
                    studentService.searchStudentByName();
                case 6 :
                    return;

                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }

}
