package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        CHUYỂN SỐ THÀNH CHỮ
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào từ 0 đến 9 muốn biết cách đọc: ");
        int num = input.nextInt();
        switch (num) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
        }
    }
}