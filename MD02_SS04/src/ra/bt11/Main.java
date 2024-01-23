package ra.bt11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student(1,"Manh",true,"12A1",18,"07347394643");
        Student student2 = new Student(1,"Hia",true,"12A1",18,"07347394643");
        Student student3 = new Student(1,"linh",false,"12A1",18,"07347394643");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        int choie;
        do {

            System.out.println("===== Menu =====");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them moi sinh vien");
            System.out.println("3. Sua thong tin sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang (1-5): ");
            System.out.println("Nhap lua chon cua ban: ");
            choie = sc.nextInt();


            switch (choie){

                case 1:
                    System.out.println("Danh sach sinh vien");
                    for (Student student : students) {
                        student.displayData();
                        System.out.println("---------------------------------");
                    }
                    break;

                case 2:
                    Student newStudent = new Student();
                    newStudent.inputData();
                    students.add(newStudent);
                    System.out.println("Sinh vien da duoc them.\n");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    int studentIdToDelete = Integer.parseInt(sc.nextLine());
                    int index = -1;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getStudentId() == studentIdToDelete) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1) {
                        Student removedStudent = students.remove(index);
                        System.out.println("Sinh vien da bi xoa:");
                        removedStudent.displayData();
                        System.out.println("---------------------------------");
                    } else {
                        System.out.println("Sinh vien khong ton tai");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhap ma sinh vien can sua: ");
                    int studentIdToUpdate = Integer.parseInt(sc.nextLine());
                    int updateIndex = -1;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getStudentId()==studentIdToUpdate) {
                            updateIndex = i;
                            break;
                        }
                    }

                    if (updateIndex != -1) {
                        System.out.println("Chon thong tin can sua:");
                        System.out.println("1. Ten Sinh vien");
                        System.out.println("2. Gioi tinh");
                        System.out.println("3. Lop");
                        System.out.println("4. Tuoi");
                        System.out.println("5. Địa chỉ");
                        int updateChoice = sc.nextInt();
                        sc.nextLine();

                        switch (updateChoice) {

                            case 1:
                                System.out.print("Nhap ten Sinh vien moi: ");
                                String newStudentName = sc.nextLine();
                                students.get(updateIndex).setStudentName(newStudentName);
                                break;
                            case 2:
                                System.out.print("Nhap gioi tinh moi (true/false): ");
                                boolean newGender = sc.nextBoolean();
                                students.get(updateIndex).setSex(newGender);
                                break;
                            case 3:
                                System.out.print("Nhap lop moi: ");
                                String newClassName = sc.nextLine();
                                students.get(updateIndex).setClassName(newClassName);
                                break;
                            case 4:
                                System.out.print("Nhap tuoi moi: ");
                                int newAge = Integer.parseInt(sc.nextLine());
                                students.get(updateIndex).setAge(newAge);
                                break;
                            case 5:
                                System.out.print("Nhap dia chi: ");
                                String newAddress = sc.nextLine();
                                students.get(updateIndex).setAddress(newAddress);
                                break;

                            default:
                                System.out.println("Chon sai vui long nhap lai.");
                                break;
                        }
                    } else {
                        System.out.println("Sinh vien khong ton tai");
                    }
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("chọn sai, vui lòng chọn lai:");
                    break;
            }

        }while (choie !=5);
    }
}