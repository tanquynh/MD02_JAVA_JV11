package ra.th3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        THỰC HÀNH
//        Kiểm tra năm nhuận
//        Năm nhuận là những năm:
//        + (IF) chia hết cho 4 nhưng không chia hết cho 100 => (ELSE) không chia hết cho 4 không phải là năm nhuận
//        + chia hết cho cả 100 và 400
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECK LEAP YEAR");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
//            chia hết cho 4
//            => check chia hết cho 100
            if (year % 100 == 0){
//                chia hết cho 100
//                => check chia hết cho 400
                if(year % 400 == 0){
//                    chia hết cho 400 => LÀ NĂM NHUẬN
                    System.out.printf("%d IS a leap year" , year);
                } else {
//                    không chia hết cho 400 => không phải năm nhuận
                    System.out.printf("%d is NOT a leap year" , year);
                }
            } else {
//                chia hết cho 4 nhưng không chia hết cho 100 => LÀ NĂM NHUẬN
                System.out.printf("%d IS a leap year" , year);
            }
        } else {
//            không chia hết cho 4 => không phải là năm nhuận
            System.out.printf("%d is NOT a leap year" , year);
        }

    }
}
