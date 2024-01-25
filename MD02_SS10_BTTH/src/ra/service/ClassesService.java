package ra.service;


import ra.config.InputMethod;
import ra.constan.Constan;
import ra.model.Classes;
import ra.model.Student;
import ra.model.Subject;
import ra.model.Teacher;
import ra.repository.FileRepo;

import java.util.ArrayList;
import java.util.List;


public class ClassesService implements IService<Classes> {
    SubjectService subjectService = new SubjectService();
    TeacherService teacherService = new TeacherService();
    StudentService studentService = new StudentService();
    FileRepo<Classes, Integer> classesFileRepo;
    public ClassesService() {
        this.classesFileRepo = new FileRepo<>(Constan.FilePath.CLASSES_PATH);
    }
    @Override
    public List<Classes> findAll() {
        return classesFileRepo.findAll();
    }

    @Override
    public void save(Classes Classes) {
        classesFileRepo.save(Classes);
    }

    @Override
    public Classes findById(int id) {
        return classesFileRepo.findById(id);
    }

    @Override
    public int findIndexById(int id) {
        return classesFileRepo.findIndexById(id);
    }

    @Override
    public int autoId() {
        return this.classesFileRepo.autoId();
    }

    public void addClasses() {
        System.out.println("Nhap so lượng lớp hoc cần thêm mới ");
        int numberOfClasses = InputMethod.getInteger();
        if (numberOfClasses <= 0) {
            System.err.println("Số lượng lớp hoc nhập vào phải lớn hơn 0");
            return;
        }
        for (int i = 0; i < numberOfClasses; i++) {

            System.out.println("Lớp học thứ " + (i + 1));
            Classes Classes = new Classes();
            Classes.setId(autoId());
            System.out.println("Nhập tên lớp học");
            Classes.setClassName(InputMethod.getString());
            System.out.println("Nhập giáo viên");
            while (true) {
                List<Teacher> teacherList = teacherService.findAll();
                if (!teacherList.isEmpty()) {
                    System.out.println("Danh sách giáo viên");
                    for (Teacher teacher : teacherList) {
                        teacher.displayTeacher();
                    }
                    System.out.println("Nhập id giáo viên");
                    int idTeacher = InputMethod.getInteger();
                    Teacher teacher = teacherService.findById(idTeacher);
                    if (teacher != null) {
                        Classes.setTeacher(teacher);
                        break;
                    } else {
                        System.err.println("id không đúng, mời nhập lại");
                    }
                } else {
                    System.err.println("Danh sách giáo viên rỗng, nhập thông tin giáo viên trươc");
                    teacherService.addTeacher();
                }
            }

            System.out.println("Nhập môn hoc");
            List<Subject> subjectList = subjectService.findAll();
            if (!subjectList.isEmpty()) {
                System.out.println("Danh sách môn hoc");
                for (Subject subject : subjectList) {
                    subject.displaySubject();
                }
                System.out.println("Nhập ID môn hoc cần thêm (Nhập 'exit' để dừng chọn môn học)");
                List<Subject> subjects = new ArrayList<>();
                while (true) {
                    String input = InputMethod.getString();
                    if (input.equalsIgnoreCase("exit")) {
                        break;
                    }
                    int idSubject = Integer.parseInt(input);
                    Subject subject = subjectService.findById(idSubject);

                    if (subject != null) {
                        boolean isDuplicate = false;
                        for (Subject existingSubject : subjects) {
                            if (existingSubject.getId().equals(idSubject)) {
                                System.err.println("Môn học đã có trong lớp");
                                isDuplicate = true;
                                break;
                            }
                        }
                        if (!isDuplicate) {
                            subjects.add(subject);
                        }
                    } else {
                        System.err.println("ID không đúng, mời nhập lại");
                    }
                }
                Classes.setSubjects(subjects);
            }

            System.out.println("Nhập học sinh");
            List<Student> studentList = studentService.findAll();
            if (!studentList.isEmpty()) {
                System.out.println("Danh sách học sinh");
                for (Student student : studentList) {
                    student.displayStudent();
                }
                System.out.println("Nhập ID học sinh cần thêm (Nhập 'exit' để dừng chọn học sinh)");
                List<Student> students = new ArrayList<>();
                while (true) {
                    String input = InputMethod.getString();
                    if (input.equalsIgnoreCase("exit")) {
                        break;
                    }
                    int idStudent = Integer.parseInt(input);
                    Student student = studentService.findById(idStudent);

                    if (student != null) {
                        boolean isDuplicate = false;
                        for (Student existingStudent : students) {
                            if (existingStudent.getId().equals(idStudent)) {
                                System.err.println("Học sinh đã có trong lớp");
                                isDuplicate = true;
                                break;
                            }
                        }
                        if (!isDuplicate) {
                            students.add(student);
                        }
                    } else {
                        System.err.println("ID không đúng, mời nhập lại");
                    }
                }
                Classes.setStudents(students);
            } else {
                System.err.println("Danh sách học sinh rỗng/ hãy nhập học sinh trước");
                studentService.addStudent();
            }

            System.out.println("Nhập trạng thái lớp học [1.Chưa mở/ 2.Đang mở/ 3.Đã đóng ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethod.getByte();
                switch (choice) {
                    case 1:
                        Classes.setClassStatus((byte) 1);
                        flag = false;
                        break;
                    case 2:
                        Classes.setClassStatus((byte) 2);
                        flag = false;
                        break;
                    case 3:
                        Classes.setClassStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời nhập lại");
                }
            }

            save(Classes);
        }


    }

    public void displayClassesAll() {
        List<Classes> Classess = findAll();
        if (Classess.isEmpty()) {
            System.out.println("Danh sách lớp học trống");
        } else {
            System.out.println("Danh sách lớp học");
            for (Classes Classes : Classess) {
                Classes.displayClassroom();
            }
        }
    }

    public void editClasses() {
        System.out.println("Nhập vào id lớp học cần sửa: ");
        int id = InputMethod.getInteger();

        Classes classEdit = findById(id);
        if (classEdit != null) {
            while (true) {
                System.out.println("Nhap lua chọn muốn thay đổi");
                System.out.println("Chọn 1 : Thay đổi tên lơp");
                System.out.println("Chọn 2 : Thay đổi giáo viên");
                System.out.println("Chọn 3 : Thay đổi môn học");
                System.out.println("Chọn 4 : Thay đổi học sinh");
                System.out.println("Chọn 5 : Thoát");
                System.out.println("Nhập lựa chọn của bạn");
                byte choice = InputMethod.getByte();
                switch (choice) {
                    case 1:
                        System.out.println("Nhập vào tên lớp học mới (Nhấn Enter để bỏ qua):");
                        String newName = InputMethod.scanner().nextLine();
                        if (!newName.trim().isEmpty()) {
                            classEdit.setClassName(newName);
                        }
                        save(classEdit);
                        break;
                    case 2:
                        changeTeacher(classEdit);
                        break;
                    case 3:
                        changeSubject(classEdit);
                        break;
                    default:
                        System.err.println("Nhập sai, mời nhập lại");
                }
            }

        } else {
            System.err.println("Không tìm thấy mã lớp học cần sửa !!!");
        }
    }

    private void changeSubject(Classes classEdit) {
        System.out.println("Danh sách môn học:");
            for (int j = 0; j < classEdit.getSubjects().size(); j++) {
                classEdit.getSubjects().get(j).displaySubject();
            }

    }

    private void changeTeacher(Classes classEdit) {
        System.out.println("Danh sách giáo viên:");
        List<Teacher> teachers = teacherService.findAll();
        for (Teacher teacher : teachers) {
            teacher.displayTeacher();
        }
       while (true) {
           System.out.println("Nhập vào id giáo viên mới: ");
           int id = InputMethod.getInteger();
           Teacher teacherEdit = teacherService.findById(id);
           if (teacherEdit != null) {
               classEdit.setTeacher(teacherEdit);
               System.out.println("Giáo viên đã được thay đổi thành công.");
               break;
           } else {
               System.err.println("Không tìm thấy mã giáo viên cần sửa !!!");
           }
       }
        save(classEdit);
    }

    public void editClassesStatus() {
        System.out.println("Nhập vào id lớp học cần sửa: ");
        int id = InputMethod.getInteger();
        int index = findIndexById(id);
        if (index != -1) {
            Classes ClassesEdit = new Classes();
            System.out.println("Nhập trạng thái lớp hoc [1.Chưa mở/ 2.đang mở/ 3.Hoàn thành ");
            boolean flag = true;
            while (flag) {
                byte choice = InputMethod.getByte();
                switch (choice) {
                    case 1:
                        ClassesEdit.setClassStatus((byte) 1);
                        flag = false;
                        break;
                    case 2:
                        ClassesEdit.setClassStatus((byte) 2);
                        flag = false;
                        break;
                    case 3:
                        ClassesEdit.setClassStatus((byte) 3);
                        flag = false;
                        break;
                    default:
                        System.err.println("Lựa chọn khong đúng, mời nhập lại");
                }
            }
            save(ClassesEdit);
        } else {
            System.err.println("Không tìm thấy mã hmôn học cần sửa !!!");
        }
    }

    public void searchClassesByName() {
        System.out.println("Nhập tên lớp học muốn tìm kiếm");
        String searchName = InputMethod.getString();
        List<Classes> Classess = findAll();
        List<Classes> Classes = new ArrayList<>();
        boolean flag = false;
        for (Classes Classes1 : Classess) {
            if (Classes1.getClassName().contains(searchName.trim())) {
                Classes.add(Classes1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách lớp học: ");
            for (Classes Classes1 : Classes) {
                Classes1.displayClassroom();
            }
        } else {
            System.err.println("Không tìm thấy lớp học phù hợp");
        }
    }


    public void searchClassesByNameTeacherStudentSubject() {
        System.out.println("1. Tìm kiếm lớp học theo tên giáo viên \n" +
                "2. Tìm kiếm lớp học theo tên học sinh \n" +
                "3. Tìm kiếm lớp học theo tên môn học \n" +
                "4. Thoát ");
        System.out.println("Nhap lua chon");
        byte choice = InputMethod.getByte();
        switch (choice) {
            case 1:
                searchClassesByTeacherName();
                break;
            case 2:
                searchClassesByStudentName();
                break;
            case 3:
                searchClassesBySubjectName();
                break;
            case 4:
                break;
        }
    }

    private void searchClassesBySubjectName() {
        System.out.println("Nhập tên môn học");
        String searchName = InputMethod.getString();
        List<Classes> classes = findAll();
        List<Classes> classesList = new ArrayList<>();
        boolean flag = false;
        for (Classes classes1: classes) {
            for (int i = 0; i < classes1.getSubjects().size(); i++) {
                if(classes1.getSubjects().get(i).getSubjectName().contains(searchName)) {
                    classesList.add(classes1);
                    flag = true;
                }
            }

        }
        if (flag) {
            System.out.println("Danh sách lớp học có môn học " + searchName + " là :");
            for (Classes classes1: classesList) {
                classes1.displayClassroom();
            }
        } else {
            System.err.println("Không tìm thấy lớp học phù hợp");
        }
    }

    private void searchClassesByStudentName() {
        System.out.println("Nhập tên học sinh");
        String searchName = InputMethod.getString();
        List<Classes> classes = findAll();
        List<Classes> classesList = new ArrayList<>();
        boolean flag = false;
        for (Classes classes1: classes) {
            for (int i = 0; i < classes1.getStudents().size(); i++) {
                if(classes1.getStudents().get(i).getStudentName().contains(searchName)) {
                    classesList.add(classes1);
                    flag = true;
                }
            }

        }
        if (flag) {
            System.out.println("Danh sách lớp học có học sinh " + searchName + " là :");
            for (Classes classes1: classesList) {
                classes1.displayClassroom();
            }
        } else {
            System.err.println("Không tìm thấy lớp học phù hợp");
        }
    }

    private void searchClassesByTeacherName() {
        System.out.println("Nhập tên giáo viên");
        String searchName = InputMethod.getString();
        List<Classes> classes = findAll();
        List<Classes> classesList = new ArrayList<>();
        boolean flag = false;
        for (Classes classes1: classes) {
            if (classes1.getTeacher().getTeacherName().contains(searchName.trim())) {
                classesList.add(classes1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách lớp học có giáo viên " + searchName + "dạy là :");
            for (Classes classes1: classesList) {
                classes1.displayClassroom();
            }
        } else {
            System.err.println("Không tìm thấy lớp học phù hợp");
        }
    }
}
