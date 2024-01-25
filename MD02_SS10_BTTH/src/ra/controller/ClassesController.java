package ra.controller;

import ra.service.ClassesService;

import java.util.Scanner;


public class ClassesController {
    ClassesService classesService = new ClassesService();

    public void displayClassroomManagementMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------CLASSROOM-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng lớp học cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả lớp học đã lưu trữ \n" +
                    "3.Thay đổi thông tin lớp học theo mã id \n" +
                    "4.Thay đổi trạng thái lớp học \n" +
                    "5.Tìm kiếm theo tên lớp học \n" +
                    "6.Tìm kiếm lớp học theo tên giáo viên, tên học sinh tên môn học \n" +
                    "7.Thoát");
            System.out.println("Nhap lua chon");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    classesService.addClasses();
                    break;
                case 2:
                    classesService.displayClassesAll();
                    break;
                case 3:
                    classesService.editClasses();
                    break;
                case 4:
                    classesService.editClassesStatus();
                    break;
                case 5:
                    classesService.searchClassesByName();
                    break;
                case 6:
                    classesService.searchClassesByNameTeacherStudentSubject();
                case 7:
                    return;
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }


}
