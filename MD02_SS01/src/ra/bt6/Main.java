package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH KIỂM TRA SỐ CHIA HẾT CHO 3 và 5");
        System.out.print("Nhập vào số cần kiểm tra: ");
        int number = input.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (number % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        } else if (number % 3 == 0) {
            System.out.println("Chỉ chia hết cho 3");
        } else {
            System.out.println("Không chia hết cho cả 3 và 5");
        }
    }
}