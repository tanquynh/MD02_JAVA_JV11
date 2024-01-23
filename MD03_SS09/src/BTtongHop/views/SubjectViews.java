package BTtongHop.views;

import BTtongHop.service.SubjectService;

import java.util.Scanner;


public class SubjectViews {
     SubjectService subjectService = new SubjectService();

   public void displaySubjectManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------SUBJECT-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng môn học cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả môn học đã lưu trữ \n" +
                    "3.Thay đổi thông tin môn học theo mã id \n" +
                    "4.Thay đổi trạng thái môn học \n" +
                    "5.Tìm kiếm theo tên môn học" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    subjectService.addSubject();
                    break;
                case 2 :
                    subjectService.displaySubjectAll();
                    break;
                case 3:
                    subjectService.editSubject();
                    break;
                case 4 :
                    subjectService.editSubjectStatus();
                    break;
                case 5:
                    subjectService.searchSubjectByName();
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }

}
