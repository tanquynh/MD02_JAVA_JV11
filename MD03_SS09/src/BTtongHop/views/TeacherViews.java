package BTtongHop.views;

import BTtongHop.config.InputMethods;
import BTtongHop.model.Student;
import BTtongHop.model.Teacher;
import BTtongHop.service.StudentService;
import BTtongHop.service.TeacherService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BTtongHop.config.InputMethods.scanner;

public class TeacherViews {
    private TeacherService teacherService;

    public TeacherViews() {
        this.teacherService = new TeacherService();
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void displayTeacherManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------TEACHER-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng giáo viên cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả giáo viên đã lưu trữ \n" +
                    "3.Thay đổi thông tin thông tinh giáo viên theo mã id \n" +
                    "4.Thay đổi trạng thái giao viên \n" +
                    "5.Tìm kiếm theo tên giáo viên" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    addTeacher();
                    break;
                case 2 :
                    displayTeacherAll();
                    break;
                case 3:
                    editTeacher();
                    break;
                case 4 :
                    editTeacherStatus();
                    break;
                case 5:
                    searchTeacherByName();
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }

    private void searchTeacherByName() {
        System.out.println("Nhập tên giáo viên muốn tìm kiếm");
        String searchName = InputMethods.getString();
        List<Teacher> teachers = teacherService.findAll();
        List<Teacher> teacher = new ArrayList<>();
        boolean flag = false;
        for (Teacher teacher1: teachers) {
            if (teacher1.getTeacherName().contains(searchName.trim())) {
                teacher.add(teacher1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách học sinh: ");
            for (Teacher teacher1: teacher) {
                teacher1.displayTeacher();
            }
        } else {
            System.err.println("Không tìm thấy học sinh phù hợp");
        }
    }

    private void editTeacherStatus() {
        System.out.println("Nhập vào id giáo viên cần sửa: ");
        int id = InputMethods.getInteger();
        List<Teacher> teachers = teacherService.findAll();
        int index = teacherService.findIndexById(id);
        if (index != -1) {
            Teacher teacherEdit = new Teacher();
            System.out.println("Nhập trạng thái học sinh [1.đang dạy/ 2.Nghỉ phep/ 3.Nghỉ việc ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethods.getByte();
                switch (choice) {
                    case 1 : teacherEdit.setTeacherStatus((byte) 1);
                        flag = false;
                        break;
                    case 2 : teacherEdit.setTeacherStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 : teacherEdit.setTeacherStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời ập lại");
                }
            }
            teacherService.save(teacherEdit);
        } else {
            System.err.println("Không tìm thấy mã học sinh cần sửa !!!");
        }
    }

    private void editTeacher() {

        System.out.println("Nhập vào id giáo viên cần sửa: ");
        int id = InputMethods.getInteger();
        int index = teacherService.findIndexById(id);
        if (index != -1) {
            Teacher teacherEdit = new Teacher();

            teacherEdit.setId(id);
            System.out.println("Nhập vào tên giáo viên mới mới (Enter để bỏ qua):");
            String newName = scanner().nextLine();
            if (!newName.trim().isEmpty()) {
                teacherEdit.setTeacherName(newName);
            }

            teacherService.save(teacherEdit);
        } else {
            System.err.println("Không tìm thấy mã giáo viên cần sửa !!!");
        }
    }

    private void displayTeacherAll() {
        List<Teacher> teachers = teacherService.findAll();
        if (teachers.isEmpty()) {
            System.err.println("Danh sách giáo viên rỗng");
        } else {
            System.out.println("Danh sách giáo viên");
            for (Teacher teacher : teachers) {
                teacher.displayTeacher();
            }
        }
    }

    private  void addTeacher() {


        System.out.println("Nhập số lượng giáo viên thêm mới");
        int numberOfTeacher = InputMethods.getInteger();
        if (numberOfTeacher <=0) {
            System.err.println("Số lượng giáo viên nhập vào phải lớn hơn 0");
            return;
        }
        for (int i = 0; i < numberOfTeacher; i++) {
            List<Teacher> teachers = teacherService.findAll();
            System.out.println("Giáo viên thứ " + (i+1));
            Teacher teacher = new Teacher();
            System.out.println("Nhập tên giáo viên");
            String teacherName = InputMethods.getString();
            teacher.setTeacherName(teacherName);

            System.out.println("Nhập trạng thái giáo viên [1.đang day/ 2.Nghỉ phep/ 3.Nghỉ việc ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethods.getByte();
                switch (choice) {
                    case 1 : teacher.setTeacherStatus((byte) 1);
                        flag = false;
                        break;
                    case 2 : teacher.setTeacherStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 : teacher.setTeacherStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời ập lại");
                }
            }
            teacher.setId(teacherService.autoInc());
            teacherService.save(teacher);
        }
        System.out.println("Tao giao viên  thành công");
    }


}
