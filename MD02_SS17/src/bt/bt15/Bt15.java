package bt.bt15;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class Bt15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập cạnh b: ");
            int b = scanner.nextInt();
            System.out.print("Nhập cạnh c: ");
            int c = scanner.nextInt();

            checkTriangleValidity(a, b, c);

            System.out.println("Ba cạnh đã nhập tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {

            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Lỗi: Nhập không hợp lệ.");
        } finally {
            // Đóng Scanner
            scanner.close();
        }
    }

    private static void checkTriangleValidity(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Ba cạnh không thể tạo thành một tam giác.");
        }
    }
}
