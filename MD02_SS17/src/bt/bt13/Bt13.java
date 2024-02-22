package bt.bt13;

import java.util.Scanner;

public class Bt13 {
    public static void main(String[] args) {
        // Bước 1: Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String originalString = scanner.nextLine();

        // Bước 2: Kiểm tra điều kiện chuỗi rỗng hoặc null
        if (originalString == null || originalString.isEmpty()) {
            System.out.println("Lỗi: Chuỗi không hợp lệ.");
            // Kết thúc chương trình khi có lỗi
            scanner.close();
            return;
        }

        // Bước 3: Đảo ngược chuỗi
        String reversedString = reverseString(originalString);

        // Bước 4: Hiển thị kết quả
        System.out.println("Chuỗi đảo ngược là: " + reversedString);

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Hàm để đảo ngược chuỗi
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
