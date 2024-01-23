package ra.bt10;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tuan");
        student.setClasses("C03");
        System.out.println("Ten sinh vien: " +student.getName());
        System.out.println("Ten lop: " +student.getClasses());
    }
}
