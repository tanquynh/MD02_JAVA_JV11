package bt.bt6;

import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số chia:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số bị chia:");
        int num1 = sc.nextInt();
        if (num2 == 0) {
            try {
                throw new Exception("Số chia không hợp lệ");
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                return;
            }
        }
        int result = num1 / num2;
        System.out.println(result);

    }
}
