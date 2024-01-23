package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tính chu vi và diện tích của hình chữ nhật
        Scanner input = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH TÍNH CHU VI VÀ DIỆN TÍCH CỦA HÌNH CHỮ NHẬT");
        System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
        int width = input.nextInt();
        System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
        int height = input.nextInt();
        System.out.println("Chu vi của hình chữ nhật là: " + 2 * width * height);
        System.out.println("Diện tích của hình chữ nhật là: " + width * height);
    }
}