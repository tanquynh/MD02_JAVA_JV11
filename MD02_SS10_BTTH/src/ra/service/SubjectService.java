package ra.service;


import ra.config.InputMethod;
import ra.constan.Constan;
import ra.model.Subject;
import ra.repository.FileRepo;

import java.util.ArrayList;
import java.util.List;


public class SubjectService implements IService<Subject>{
    FileRepo<Subject, Integer> subjectFileRepo;
    public SubjectService() {
        this.subjectFileRepo = new FileRepo<>(Constan.FilePath.SUBJECT_PATH);
    }
    @Override
    public List<Subject> findAll() {
       return this.subjectFileRepo.findAll();
    }

    @Override
    public void save(Subject subject) {
       this.subjectFileRepo.save(subject);
    }

    @Override
    public Subject findById(int id) {
        return this.subjectFileRepo.findById(id);
    }

    @Override
    public int findIndexById(int id) {
        return this.subjectFileRepo.findIndexById(id);
    }

    @Override
    public int autoId() {
        return this.subjectFileRepo.autoId();
    }

    public void searchSubjectByName() {
        System.out.println("Nhập tên môn học muốn tìm kiếm");
        String searchName = InputMethod.getString();
        List<Subject> subjects = findAll();
        List<Subject> subject = new ArrayList<>();
        boolean flag = false;
        for (Subject subject1: subjects) {
            if (subject1.getSubjectName().contains(searchName.trim())) {
                subject.add(subject1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Danh sách môn học: ");
            for (Subject subject1: subject) {
                subject1.displaySubject();
            }
        } else {
            System.err.println("Không tìm thấy môn học phù hợp");
        }
    }

    public void editSubjectStatus() {
        System.out.println("Nhập vào id môn học cần sửa: ");
        int id = InputMethod.getInteger();

        Subject subjectEdit = findById(id);
        if (subjectEdit != null) {

            subjectEdit.setSubjectName(findById(id).getSubjectName());
            System.out.println("Nhập trạng thái môn học [true.đang mở/ false.đã đóng");

            do {
                String inputSubjectStatus = InputMethod.scanner().nextLine();
                if (inputSubjectStatus.trim().equals("true") || inputSubjectStatus.trim().equals("false")) {
                    subjectEdit.setSubjectStatus(Boolean.parseBoolean(inputSubjectStatus.trim()));
                    break;
                } else {
                    System.err.println("Vui lòng nhập 'true' hoặc 'false'");
                }
            } while (true);
            save(subjectEdit);
        } else {
            System.err.println("Không tìm thấy mã hmôn học cần sửa !!!");
        }
    }

    public void editSubject() {
        System.out.println("Nhập vào id môn học cần sửa: ");
        int id = InputMethod.getInteger();
        int index = findIndexById(id);
        Subject subjectEdit = findById(id);
        if (subjectEdit != null) {

            subjectEdit.setId(id);
            System.out.println("Nhập vào tên môn học mới (Enter để bỏ qua):");
            String newName = InputMethod.scanner().nextLine();
            if (!newName.trim().isEmpty()) {
                subjectEdit.setSubjectName(newName);
            }

            save(subjectEdit);
        } else {
            System.err.println("Không tìm thấy mã môn học cần sửa !!!");
        }
    }

    public void displaySubjectAll() {
        List<Subject> subjects = findAll();
        if (subjects.isEmpty()) {
            System.err.println("Danh sách môn học rỗng");
        } else {
            System.out.println("Danh sách môn học");
            for (Subject subject : subjects) {
                subject.displaySubject();
            }
        }
    }

    public void addSubject() {

        System.out.println("Nhập số lượng môn học thêm mới");
        int numberOfStudent = InputMethod.getInteger();
        if (numberOfStudent <=0) {
            System.err.println("Số lượng lơp học nhập vào phải lớn hơn 0");
            return;
        }
        for (int i = 0; i < numberOfStudent; i++) {
            List<Subject> subjects = findAll();
            System.out.println("Môn thứ " + (i+1));
            Subject subject = new Subject();
            System.out.println("Nhập tên môn học");
            String subjectName = InputMethod.getString();
            subject.setSubjectName(subjectName);

            System.out.println("Nhập trạng thái môn học[true.đang mở/ false.đã đóng");
            do {
                String inputSubjectStatus = InputMethod.scanner().nextLine();
                if (inputSubjectStatus.trim().equals("true") || inputSubjectStatus.trim().equals("false")) {
                    subject.setSubjectStatus(Boolean.parseBoolean(inputSubjectStatus.trim()));
                    break;
                } else {
                    System.err.println("Vui lòng nhập 'true' hoặc 'false'");
                }


            } while (true);
            subject.setId(autoId());
            save(subject);

        }
        System.out.println("Tao môn học thành công");
    }
}
