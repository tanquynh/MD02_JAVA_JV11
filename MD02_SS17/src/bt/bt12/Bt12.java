package bt.bt12;

import java.util.Scanner;

public class Bt12 {
    public static void main(String[] args) {
        // Bước 1: Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Bước 2: Kiểm tra điều kiện cả hai số bằng 0
        if (num1 == 0 && num2 == 0) {
            System.out.println("Lỗi: Cả hai số đều bằng 0. Không có ước chung lớn nhất.");
            // Kết thúc chương trình khi có lỗi
            scanner.close();
            return;
        }

        // Bước 3: Tìm ước chung lớn nhất (UCLN)
        int ucln = findUCLN(num1, num2);

        // Bước 4: Hiển thị kết quả
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + ucln);

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Hàm để tìm ước chung lớn nhất sử dụng thuật toán Euclid
    private static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
