package ra.run;


import ra.controller.ClassesController;
import ra.controller.StudentController;
import ra.controller.SubjectController;
import ra.controller.TeacherController;

import java.util.Scanner;

public class SchoolManagenment {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------SCHOOL-MANAGEMENT----------------");
            System.out.println("1. Quản lý môn học \n" +
                    "2. Quản lý học sinh \n" +
                    "3. Quản lý giáo viên \n" +
                    "4. Quản lý lớp học \n" +
                    "5. Thoát ");
            System.out.println("Nhap lua chon");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    new SubjectController().displaySubjectManagementMenu();
                    break;
                case 2:
                    new StudentController().displayStudentManagementMenu();
                    break;
                case 3:
                    new TeacherController().displayTeacherManagementMenu();
                    break;
                case 4:
                    new ClassesController().displayClassroomManagementMenu();
                    break;
                case 5 :
                    return;

            }
        }
    }
}
