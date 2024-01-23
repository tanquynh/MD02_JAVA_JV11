package BTtongHop.views;

import BTtongHop.service.ClassroomService;

import java.util.Scanner;


public class ClassroomViews {
     ClassroomService classroomService = new ClassroomService();


    public void displayClassroomManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------CLASSROOM-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng lớp học cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả lớp học đã lưu trữ \n" +
                    "3.Thay đổi thông tin lớp học theo mã id \n" +
                    "4.Thay đổi trạng thái lớp học \n" +
                    "5.Tìm kiếm theo tên lớp học" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    classroomService.addClassroom();
                    break;
                case 2 :
                    classroomService.displayClassroomAll();
                    break;
                case 3:
                    classroomService.editClassroom();
                    break;
                case 4 :
                    classroomService.editClassroomStatus();
                    break;
                case 5:
                    classroomService.searchClassroomByName();
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }




    
   
    

}
