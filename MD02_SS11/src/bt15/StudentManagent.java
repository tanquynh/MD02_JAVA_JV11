package bt15;

import java.util.*;

public class StudentManagent {
     static  List<Student> studentList ;
     static {
            studentList = new ArrayList<>(Arrays.asList(
                new Student(1,"Tuan",8.9),
                new Student(2,"Manh",8.3),
                new Student(3,"Hai",9.1)
            ));
     }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------MENU----------");
            System.out.println("1.Hiển thị tất cả học sinh ");
            System.out.println("2.Thêm học sinh");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm sinh viên theo id");
            System.out.println("5. Điểm trung bình tất cả sinh viên");
            System.out.println("6. Sắp xếp sinh viên theo điểm tăng dần");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showAll();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    System.out.println("Nhập id học sinh muốn xoas");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    removeStudent(deleteId);
                    break;
                case 4 :
                    System.out.println("Nhập id học sinh cần tìm");
                    int id = Integer.parseInt(sc.nextLine());
                    findStudentById(id);
                    break;
                case 5:
                    getAverageScore();
                    break;
                case 6 :
                    sortByScore();
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không đúng, mời nhâ lại");
            }

        }
    }

    public static void showAll() {
        if(studentList.isEmpty()) {
            System.err.println("Danh sách học sinh rỗng");
            return;
        } else {
            System.out.println("Danh sách học sinh");
            for (Student student : studentList) {
                System.out.println(student.toString());
            }
        }
    }

    private static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng ho sinh cần thêm");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.setStudentId(autoId());
            System.out.println("Nhập tên sinh viên");
            student.setName(sc.nextLine());
            System.out.println("Nhap điểm trung bình");
            student.setAverageScore(Double.parseDouble(sc.nextLine()));
            studentList.add(student);
        }
    }

    private static void removeStudent( int deleteId) {
        for (Student student : studentList) {
            if(student.getStudentId() == deleteId) {
                studentList.remove(student);
                System.out.println("Đã xóa học sinh với id :" + deleteId + " thành công");
                return;
            }
        }
        System.err.println("Id nhập vào không phù hợp");

    }

    private static Student findStudentById(int id) {
        for (Student student : studentList) {
            if(student.getStudentId() == id) {
                return student;
            }
        }
        System.err.println("Id nhập vào không phù hợp");
        return null;

    }

    private static void getAverageScore() {

        double sum = 0;
        for (int i = 0; i < studentList.size(); i++) {
            sum = sum + studentList.get(i).getAverageScore();
        }
        double avg = sum / studentList.size();
        System.out.println("Điểm trung bình : " + avg);
    }

    private static void sortByScore() {
//        studentList.sort(Comparator.comparingDouble(Student::getAverageScore));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Double.compare(student1.getAverageScore(), student2.getAverageScore());
            }
        });
        System.out.println(studentList.toString());
    }

    private static int autoId(){
        int maxId ;
         maxId = studentList.isEmpty() ? 0 : studentList.get(studentList.size() -1).getStudentId();
         return maxId + 1;
    }
}
