package BTtongHop.run;

import BTtongHop.views.ClassroomViews;
import BTtongHop.views.StudentViews;
import BTtongHop.views.SubjectViews;
import BTtongHop.views.TeacherViews;

import java.util.Scanner;

public class SchoolManagenment {
    private StudentViews studentViews;

    public SchoolManagenment(StudentViews studentViews) {
        this.studentViews = studentViews;
    }

    public StudentViews getStudentViews() {
        return studentViews;
    }

    public void setStudentViews(StudentViews studentViews) {
        this.studentViews = studentViews;
    }

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
                    new SubjectViews().displaySubjectManagementMenu();
                    break;
                case 2:
                    new StudentViews().displayStudentManagementMenu();
                    break;
                case 3:
                    new TeacherViews().displayTeacherManagementMenu();
                    break;
                case 4:
                    new ClassroomViews().displayClassroomManagementMenu();
                    break;

            }
        }
    }
}
