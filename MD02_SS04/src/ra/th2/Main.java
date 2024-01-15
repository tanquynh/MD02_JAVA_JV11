package ra.th2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(01,"Nguyen Van A",true,"12A1",18,"Ha Noi");
        Student student2 = new Student(02,"Nguyen Thi B",false,"12A2",18,"Da Nang");
        Student student3 = new Student(04,"Nguyen Van C",true,"12A4",18,"Ha Noi");
        System.out.println("Thong tin sinh vien");
        student1.display();
        System.out.println("Thong tin sinh vien");
        student2.display();
        System.out.println("Thong tin sinh vien");
        student3.display();
    }
}
