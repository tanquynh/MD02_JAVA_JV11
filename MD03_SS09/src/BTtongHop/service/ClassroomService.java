package BTtongHop.service;

<<<<<<< HEAD
import BTtongHop.config.InputMethods;
import BTtongHop.model.Classroom;
import BTtongHop.repository.FileRepo;

import java.util.ArrayList;
=======
import BTtongHop.model.Classroom;
import BTtongHop.repository.FileRepo;

>>>>>>> dcdd86b34244499964306f812461b0b258747207
import java.util.List;

public class ClassroomService implements IService<Classroom>{
    FileRepo<Classroom,Integer> classesFileRepo ;
    @Override
    public List<Classroom> findAll() {
        return this.classesFileRepo.findAll();
    }

    @Override
    public void save(Classroom classroom) {
        this.classesFileRepo.save(classroom);
    }

    @Override
    public Classroom findById(int id) {
        return this.classesFileRepo.findByid(id);
    }

    @Override
    public int findIndexById(int id) {
        return this.classesFileRepo.findIndexById(id);
    }

    @Override
    public int autoInc() {
        return this.classesFileRepo.autoInc();
    }
<<<<<<< HEAD
    public void addClassroom() {
    }
    public void displayClassroomAll() {
    }

    public void editClassroom() {
    }

    public void editClassroomStatus() {
        System.out.println("Nhập vào id lớp học cần sửa: ");
        int id = InputMethods.getInteger();
        int index = findIndexById(id);
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
            save(classroomEdit);
        } else {
            System.err.println("Không tìm thấy mã hmôn học cần sửa !!!");
        }
    }

    public void searchClassroomByName() {
        System.out.println("Nhập tên lớp học muốn tìm kiếm");
        String searchName = InputMethods.getString();
        List<Classroom> classrooms = findAll();
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


=======
>>>>>>> dcdd86b34244499964306f812461b0b258747207
}
