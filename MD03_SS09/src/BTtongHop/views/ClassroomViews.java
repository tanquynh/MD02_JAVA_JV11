package BTtongHop.views;

<<<<<<< HEAD
import BTtongHop.service.ClassroomService;

import java.util.Scanner;


public class ClassroomViews {
     ClassroomService classroomService = new ClassroomService();


=======
import BTtongHop.config.InputMethods;
import BTtongHop.model.Classroom;
import BTtongHop.model.Student;
import BTtongHop.model.Subject;
import BTtongHop.service.ClassroomService;
import BTtongHop.service.SubjectService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BTtongHop.config.InputMethods.scanner;

public class ClassroomViews {
    private ClassroomService classroomService;

    public ClassroomViews() {
    }

    public ClassroomViews(SubjectService subjectService) {
        this.classroomService = new ClassroomService();
    }

    public ClassroomService getClassroomService() {
        return classroomService;
    }

    public void setClassroomService(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }
>>>>>>> dcdd86b34244499964306f812461b0b258747207
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
<<<<<<< HEAD
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
=======
                    addClassroom();
                    break;
                case 2 :
                    displayClassroomAll();
                    break;
                case 3:
                    editClassroom();
                    break;
                case 4 :
                    editClassroomStatus();
                    break;
                case 5:
                    searchClassroomByName();
>>>>>>> dcdd86b34244499964306f812461b0b258747207
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }

<<<<<<< HEAD


=======
    private void addClassroom() {
    }

    private void displayClassroomAll() {
    }

    private void editClassroom() {
    }

    private void searchClassroomByName() {
        System.out.println("Nhập tên lớp học muốn tìm kiếm");
        String searchName = InputMethods.getString();
        List<Classroom> classrooms = classroomService.findAll();
        List<Classroom> classroom = new ArrayList<>();
        boolean flag = false;
        for (Classroom classroom1: classrooms) {
            if (classroom1.getClassName().contains(searchName.trim())) {
                classroom.add(classroom1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách lớp học: ");
            for (Classroom classroom1: classroom) {
                classroom1.displaClassroom();
            }
        } else {
            System.err.println("Không tìm thấy lớp học phù hợp");
        }
    }

    private void editClassroomStatus() {
        System.out.println("Nhập vào id lớp học cần sửa: ");
        int id = InputMethods.getInteger();
        int index = classroomService.findIndexById(id);
        if (index != -1) {
            Classroom classroomEdit = new Classroom();
            System.out.println("Nhập trạng thái lớp hoc [1.Chưa mở/ 2.đang mở/ 3.Hoàn thành ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethods.getByte();
                switch (choice) {
                    case 1 : classroomEdit.setClassStatus((byte) 1);
                        flag = false;
                        break;
                    case 2 :  classroomEdit.setClassStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 :  classroomEdit.setClassStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời nhập lại");
                }
            }
            classroomService.save(classroomEdit);
        } else {
            System.err.println("Không tìm thấy mã hmôn học cần sửa !!!");
        }
    }
>>>>>>> dcdd86b34244499964306f812461b0b258747207

    
   
    

}
