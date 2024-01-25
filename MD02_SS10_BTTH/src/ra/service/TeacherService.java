package ra.service;



import ra.config.InputMethod;
import ra.constan.Constan;
import ra.model.Teacher;
import ra.repository.FileRepo;

import java.util.ArrayList;
import java.util.List;


public class TeacherService implements IService<Teacher> {
    FileRepo<Teacher, Integer> teacherFileRepo;
    public  TeacherService() {
        this.teacherFileRepo = new FileRepo<>(Constan.FilePath.TEACHER_PATH);
    }
    @Override
    public List<Teacher> findAll() {
        return this.teacherFileRepo.findAll();
    }

    @Override
    public void save(Teacher teacher) {
        this.teacherFileRepo.save(teacher);
    }

    @Override
    public Teacher findById(int id) {
        return this.teacherFileRepo.findById(id);
    }

    @Override
    public int findIndexById(int id) {
        return this.teacherFileRepo.findIndexById(id);
    }

    @Override
    public int autoId() {
        return this.teacherFileRepo.autoId();
    }

    public void addTeacher() {

        System.out.println("Nhập số lượng giáo viên thêm mới");
        int numberOfTeacher = InputMethod.getInteger();
        if (numberOfTeacher <=0) {
            System.err.println("Số lượng giáo viên nhập vào phải lớn hơn 0");
            return;
        }
        for (int i = 0; i < numberOfTeacher; i++) {
            System.out.println("Giáo viên thứ " + (i+1));
            Teacher teacher = new Teacher();
            System.out.println("Nhập tên giáo viên");
            String teacherName = InputMethod.getString();
            teacher.setTeacherName(teacherName);

            System.out.println("Nhập trạng thái giáo viên [1.đang day/ 2.Nghỉ phep/ 3.Nghỉ việc ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethod.getByte();
                switch (choice) {
                    case 1 : teacher.setTecherStatus((byte) 1);
                        flag = false;
                        break;
                    case 2 : teacher.setTecherStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 : teacher.setTecherStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời ập lại");
                }
            }
            teacher.setId(autoId());
            save(teacher);
        }
        System.out.println("Tao giao viên  thành công");
    }

    public void searchTeacherByName() {
        System.out.println("Nhập tên giáo viên muốn tìm kiếm");
        String searchName = InputMethod.getString();
        List<Teacher> teachers =findAll();
        List<Teacher> teacher = new ArrayList<>();
        boolean flag = false;
        for (Teacher teacher1: teachers) {
            if (teacher1.getTeacherName().contains(searchName.trim())) {
                teacher.add(teacher1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách giao vien: ");
            for (Teacher teacher1: teacher) {
                teacher1.displayTeacher();
            }
        } else {
            System.err.println("Không tìm thấy giáo viên phù hợp");
        }
    }

    public void editTeacherStatus() {
        System.out.println("Nhập vào id giáo viên cần sửa: ");
        int id = InputMethod.getInteger();
        Teacher teacherEdit = findById(id);
        if (teacherEdit != null) {

            System.out.println("Nhập trạng thái học sinh [1.đang dạy/ 2.Nghỉ phep/ 3.Nghỉ việc ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethod.getByte();
                switch (choice) {
                    case 1 : teacherEdit.setTecherStatus((byte) 1);
                        flag = false;
                        break;
                    case 2 : teacherEdit.setTecherStatus((byte) 2);
                        flag = false;
                        break;
                    case 3 : teacherEdit.setTecherStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời ập lại");
                }
            }
            save(teacherEdit);
        } else {
            System.err.println("Không tìm thấy mã giáo viên cần sửa !!!");
        }
    }

    public void editTeacher() {

        System.out.println("Nhập vào id giáo viên cần sửa: ");
        int id = InputMethod.getInteger();
        Teacher teacherEdit = findById(id);
        if (teacherEdit != null) {

            System.out.println("Nhập vào tên giáo viên mới mới (Enter để bỏ qua):");
            String newName =InputMethod.scanner().nextLine();
            if (!newName.trim().isEmpty()) {
                teacherEdit.setTeacherName(newName);
            }

            save(teacherEdit);
        } else {
            System.err.println("Không tìm thấy mã giáo viên cần sửa !!!");
        }
    }

    public void displayTeacherAll() {
        List<Teacher> teachers = findAll();
        if (teachers.isEmpty()) {
            System.err.println("Danh sách giáo viên rỗng");
        } else {
            System.out.println("Danh sách giáo viên");
            for (Teacher teacher : teachers) {
                teacher.displayTeacher();
            }
        }
    }
}
