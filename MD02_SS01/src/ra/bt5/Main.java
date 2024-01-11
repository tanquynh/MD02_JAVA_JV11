package ra.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH ĐÁNH GIÁ XẾP LOẠI HỌC SINH DỰA TRÊN ĐIỂM TRUNG BÌNH CÁC MÔN HỌC");
        System.out.print("Nhập vào điểm Toán: ");
        int math = input.nextInt();
        System.out.print("Nhập vào điểm Lý: ");
        int physics = input.nextInt();
        System.out.print("Nhập vào điểm Hóa: ");
        int chemistry = input.nextInt();
        System.out.print("Nhập vào điểm Văn: ");
        int literature = input.nextInt();
        System.out.print("Nhập vào điểm Anh: ");
        int english = input.nextInt();
        double average = (math + physics + chemistry + literature + english) / 5.0;
        System.out.print("Xếp loại: ");
        if (0 <= average & average < 5.0) {
            System.out.println("Yếu");
        } else if (5 <= average & average < 6.5) {
            System.out.println("Trung bình");
        } else if (6.5 <= average & average < 8.0) {
            System.out.println("Khá");
        } else if (8.0 <= average & average < 9.0) {
            System.out.println("Giỏi");
        } else {
            System.out.println("Xuất sắc");
        }
    }
}