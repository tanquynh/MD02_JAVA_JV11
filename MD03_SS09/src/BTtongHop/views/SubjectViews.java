package BTtongHop.views;

import BTtongHop.config.InputMethods;
import BTtongHop.model.Subject;
import BTtongHop.service.SubjectService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BTtongHop.config.InputMethods.scanner;

public class SubjectViews {
    private SubjectService subjectService;

    public SubjectViews() {
    }

    public SubjectViews(SubjectService subjectService) {
        this.subjectService = new SubjectService();
    }

    public SubjectService getSubjectService() {
        return subjectService;
    }

    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }
    public void displaySubjectManagementMenu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------SUBJECT-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng môn học cần thêm và nhập thông tin cần thêm mới \n" +
                    "2.Hiển thị danh sách tất cả môn học đã lưu trữ \n" +
                    "3.Thay đổi thông tin môn học theo mã id \n" +
                    "4.Thay đổi trạng thái môn học \n" +
                    "5.Tìm kiếm theo tên môn học" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    addSubject();
                    break;
                case 2 :
                    displaySubjectAll();
                    break;
                case 3:
                    editSubject();
                    break;
                case 4 :
                    editSubjectStatus();
                    break;
                case 5:
                    searchSubjectByName();
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }
    }

    private void searchSubjectByName() {
        System.out.println("Nhập tên môn học muốn tìm kiếm");
        String searchName = InputMethods.getString();
        List<Subject> subjects = subjectService.findAll();
        List<Subject> subject = new ArrayList<>();
        boolean flag = false;
        for (Subject subject1: subjects) {
            if (subject1.getSunjectName().contains(searchName.trim())) {
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

    private void editSubjectStatus() {
        System.out.println("Nhập vào id môn học cần sửa: ");
        int id = InputMethods.getInteger();
        int index = subjectService.findIndexById(id);
        if (index != -1) {
            Subject subjectEdit = new Subject();
            System.out.println("Nhập trạng thái môn học [true.đang mở/ false.đã đóng");
            boolean flag = true;
            do {
                String inputSubjectStatus = InputMethods.scanner().nextLine();
                if (inputSubjectStatus.trim().equals("true") || inputSubjectStatus.trim().equals("false")) {
                    subjectEdit.setSubjectStatus(Boolean.parseBoolean(inputSubjectStatus.trim()));
                    break;
                } else {
                    System.err.println("Vui lòng nhập 'true' hoặc 'false'");
                }
            } while (true);
            subjectService.save(subjectEdit);
        } else {
            System.err.println("Không tìm thấy mã hmôn học cần sửa !!!");
        }
    }

    private void editSubject() {
        System.out.println("Nhập vào id môn học cần sửa: ");
        int id = InputMethods.getInteger();
        int index = subjectService.findIndexById(id);
        if (index != -1) {
            Subject subjectEdit = new Subject();
            subjectEdit.setId(id);
            System.out.println("Nhập vào tên môn học mới (Enter để bỏ qua):");
            String newName = scanner().nextLine();
            if (!newName.trim().isEmpty()) {
                subjectEdit.setSunjectName(newName);
            }

            subjectService.save(subjectEdit);
        } else {
            System.err.println("Không tìm thấy mã môn học cần sửa !!!");
        }
    }

    private void displaySubjectAll() {
        List<Subject> subjects = subjectService.findAll();
        if (subjects.isEmpty()) {
            System.err.println("Danh sách môn học rỗng");
        } else {
            System.out.println("Danh sách môn học");
            for (Subject subject : subjects) {
                subject.displaySubject();
            }
        }
    }

    private void addSubject() {


        System.out.println("Nhập số lượng môn học thêm mới");
        int numberOfStudent = InputMethods.getInteger();
        if (numberOfStudent <=0) {
            System.err.println("Số lượng lơp học nhập vào phải lớn hơn 0");
            return;
        }
        for (int i = 0; i < numberOfStudent; i++) {
            List<Subject> subjects = subjectService.findAll();
            System.out.println("Môn thứ " + (i+1));
            Subject subject = new Subject();
            System.out.println("Nhập tên môn học");
            String subjectName = InputMethods.getString();
            subject.setSunjectName(subjectName);

            System.out.println("Nhập trạng thái môn học[true.đang mở/ false.đã đóng");
            do {
                String inputSubjectStatus = InputMethods.scanner().nextLine();
                if (inputSubjectStatus.trim().equals("true") || inputSubjectStatus.trim().equals("false")) {
                    subject.setSubjectStatus(Boolean.parseBoolean(inputSubjectStatus.trim()));
                    break;
                } else {
                    System.err.println("Vui lòng nhập 'true' hoặc 'false'");
                }
            } while (true);
            subject.setId(subjectService.autoInc());
            subjectService.save(subject);
        }
        System.out.println("Tao môn học thành công");

    }


}
