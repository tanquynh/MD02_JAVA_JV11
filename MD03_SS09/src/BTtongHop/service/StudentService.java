package BTtongHop.service;

<<<<<<< HEAD
import BTtongHop.config.InputMethods;
=======
>>>>>>> dcdd86b34244499964306f812461b0b258747207
import BTtongHop.constant.Contant;
import BTtongHop.model.Student;
import BTtongHop.repository.FileRepo;

<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BTtongHop.config.InputMethods.scanner;

=======
import java.util.List;
import java.util.Scanner;

>>>>>>> dcdd86b34244499964306f812461b0b258747207
public class StudentService implements IService<Student>{
    FileRepo<Student, Integer> studentFileRepo;
    public StudentService() {
        this.studentFileRepo = new FileRepo<>(Contant.FilePath.STUDENT_FILE);
    }


    @Override
    public List<Student> findAll() {
        return this.studentFileRepo.findAll();
    }

    @Override
    public void save(Student student) {
        this.studentFileRepo.save(student);
    }

    @Override
    public Student findById(int id) {
        return this.studentFileRepo.findByid(id);
    }


    @Override
    public int findIndexById(int id) {
        return this.studentFileRepo.findIndexById(id);
    }

    @Override
    public int autoInc() {
        return this.studentFileRepo.autoInc();
    }


<<<<<<< HEAD
    public void searchStudentByName() {
        System.out.println("Nhập tên học sinh muốn tìm kiếm");
        String searchName = InputMethods.getString();
        List<Student> students = findAll();
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

    public void editStudentStatus() {
        System.out.println("Nhập vào id học sinh cần sửa: ");
        int id = InputMethods.getInteger();
        List<Student> students = findAll();
        int index = findIndexById(id);
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
                        System.err.println("Lựa chọn khong đúng, mời nhập lại");
                }
            }
           save(studentEdit);
        } else {
            System.err.println("Không tìm thấy mã học sinh cần sửa !!!");
        }
    }

    public void editStudent() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simf = new SimpleDateFormat(pattern);

        System.out.println("Nhập vào id học sinh cần sửa: ");
        int id = InputMethods.getInteger();
        int index = findIndexById(id);
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
           save(studentEdit);
        } else {
            System.err.println("Không tìm thấy mã học sinh cần sửa !!!");
        }
    }

    public void displayStudentAll() {
        List<Student> students = findAll();
        if (students.isEmpty()) {
            System.err.println("Danh sách học sinh rỗng");
        } else {
            System.out.println("Danh sách học sinh");
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }

    public void addStudent() {
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
            List<Student> students = findAll();
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
            student.setId(autoInc());
            save(student);
        }
        System.out.println("Tao học sinh thành công");
    }
=======
>>>>>>> dcdd86b34244499964306f812461b0b258747207
}
