package bt.bt14;

import java.util.Scanner;

public class Bt14 {
    public static void main(String[] args) {
        // Bước 1: Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Bước 2: Kiểm tra điều kiện mảng rỗng
        if (n <= 0) {
            System.out.println("Lỗi: Mảng không có phần tử nào hoặc số lượng phần tử không hợp lệ.");
            // Kết thúc chương trình khi có lỗi
            scanner.close();
            return;
        }

        // Bước 3: Nhập giá trị cho mảng
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 4: Tính giá trị trung bình
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / n;

        // Bước 5: Hiển thị kết quả
        System.out.println("Giá trị trung bình của mảng là: " + average);

        // Bước 6: Kết thúc chương trình
        scanner.close();
    }
}
