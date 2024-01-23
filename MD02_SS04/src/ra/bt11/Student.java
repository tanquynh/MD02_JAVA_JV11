package ra.bt11;

import java.util.Scanner;

public class Student {
    private int studentId ;
    private String studentName ;
    private boolean sex ;
    private String className ;
    private int age ;
    private String address ;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputData() {

        Scanner  scanner = new Scanner(System.in);
        System.out.print("Nhap ma HS: ");
        studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("NHap ten hs:");
        studentName = scanner.nextLine();
        System.out.println("Nhap gioi tinh :");
        sex = Boolean.parseBoolean(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Nhap ten lop: ");
        className =scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi: ");
        address =scanner.nextLine();



    }

    public void displayData() {
        System.out.println("Ma HS: " + studentId);
        System.out.println("Ten HS: " + studentName);
        System.out.println("Gioi tinh: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Lop : " + className);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);

    }
}
