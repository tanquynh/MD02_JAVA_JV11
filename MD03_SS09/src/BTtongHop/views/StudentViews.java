package BTtongHop.views;

import BTtongHop.config.InputMethods;
import BTtongHop.model.Student;
import BTtongHop.service.StudentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static BTtongHop.config.InputMethods.scanner;

public class StudentViews {
    private  StudentService studentService;

    public StudentViews() {
        this.studentService = new StudentService();
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void displayStudentManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------STUDENT-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng học sinh cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả học sinh đã lưu trữ \n" +
                    "3.Thay đổi thông tin thông tinh học sinh theo mã id \n" +
                    "4.Thay đổi trạng thái học sinh \n" +
                    "5.Tìm kiếm theo tên học sinh" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2 :
                    displayStudentAll();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4 :
                        editStudentStatus();
                        break;
                case 5: 
                    searchStudentByName();
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }

    private void searchStudentByName() {
        System.out.println("Nhập tên học sinh muốn tìm kiếm");
        String searchName = InputMethods.getString();
        List<Student> students = studentService.findAll();
        List<Student> student = new ArrayList<>();
        boolean flag = false;
        for (Student student1: students) {
            if (student1.getStudentName().contains(searchName.trim())) {
                student.add(student1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách học sinh: ");
            for (Student student1: student) {
                student1.displayStudent();
            }
        } else {
            System.err.println("Không tìm thấy học sinh phù hợp");
        }
    }

    private void editStudentStatus() {
        System.out.println("Nhập vào id học sinh cần sửa: ");
        int id = InputMethods.getInteger();
        List<Student> students = studentService.findAll();
        int index = studentService.findIndexById(id);
        if (index != -1) {
            Student studentEdit = new Student();
            System.out.println("Nhập trạng thái học sinh [1.đang học/ 2.on job training/ 3.Tốt nghiêp ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethods.getByte();
                switch (choice) {
                    case 1 : studentEdit.setStudentStatus((byte) 1);
                        flag = false;
                        break;
                    case 2 : studentEdit.setStudentStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 : studentEdit.setStudentStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời ập lại");
                }
            }
            studentService.save(studentEdit);
        } else {
            System.err.println("Không tìm thấy mã học sinh cần sửa !!!");
        }
    }

    private void editStudent() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simf = new SimpleDateFormat(pattern);

        System.out.println("Nhập vào id học sinh cần sửa: ");
        int id = InputMethods.getInteger();
//        List<Student> students = studentService.findAll();
        int index = studentService.findIndexById(id);
        if (index != -1) {
            Student studentEdit = new Student();
            boolean isExit = true;
            studentEdit.setId(id);
            System.out.println("Nhập vào tên học sinh mới mới (Enter để bỏ qua):");
            String newName = scanner().nextLine();
            if (!newName.trim().isEmpty()) {
                studentEdit.setStudentName(newName);
            }
            System.out.println("Nhập ngày sinh học sinh (Enter để bỏ qua):");
            String newBirthday = scanner().nextLine();
            if(!newBirthday.isEmpty()) {
                while (true) {
                    try {
                        studentEdit.setDatOfBirthday(simf.parse(scanner().nextLine())) ;
                        break;
                    } catch (ParseException e) {
                        System.err.println("Nhập ngày sinh không đúng định dạng mời nhập lại");;
                    }
                }
            }
            studentService.save(studentEdit);
        } else {
            System.err.println("Không tìm thấy mã học sinh cần sửa !!!");
        }
    }

    private void displayStudentAll() {
        List<Student> students = studentService.findAll();
        if (students.isEmpty()) {
            System.err.println("Danh sách học sinh rỗng");
        } else {
            System.out.println("Danh sách học sinh");
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }

    private  void addStudent() {
        Scanner sc = new Scanner(System.in);
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simf = new SimpleDateFormat(pattern);
        System.out.println("Nhập số lượng học sinh thêm mới");
         int numberOfStudent = InputMethods.getInteger();
         if (numberOfStudent <=0) {
             System.err.println("Số lượng học sinh nhập vào phải lớn hơn 0");
             return;
         }
        for (int i = 0; i < numberOfStudent; i++) {
            List<Student> students = studentService.findAll();
            System.out.println("Học sinh thứ " + (i+1));
            Student student = new Student();
            System.out.println("Nhập tên học sinh");
            String studentName = InputMethods.getString();
            student.setStudentName(studentName);
            System.out.println("Nhập ngày sinh học sinh");
            while (true) {
                try {
                    student.setDatOfBirthday(simf.parse(sc.nextLine())) ;
                    break;
                } catch (ParseException e) {
                    System.err.println("Nhập ngày sinh không đúng định dạng mời nhập lại");;
                }
            }
            System.out.println("Nhập trạng thái học sinh [1.đang học/ 2.on job training/ 3.Tốt nghiêp ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethods.getByte();
                switch (choice) {
                    case 1 : student.setStudentStatus((byte) 1);
                    flag = false;
                    break;
                    case 2 : student.setStudentStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 : student.setStudentStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời ập lại");
                }
            }
            student.setId(studentService.autoInc());
            studentService.save(student);
        }
        System.out.println("Tao học sinh thành công");
    }


}
