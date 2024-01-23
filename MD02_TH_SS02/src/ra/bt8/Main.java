package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Xác thực dữ liệu sử dụng vòng lặp
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        do {
            System.out.print("Nhập vào giá trị của cạnh thứ nhất: ");
            a = sc.nextDouble();
            System.out.print("Nhập vào giá trị của cạnh thứ hai: ");
            b = sc.nextDouble();
            System.out.print("Nhập vào giá trị của cạnh thứ ba: ");
            c = sc.nextDouble();
            if(!checkLegitTriangle(a, b, c)){
                System.out.println("Độ dài 3 cạnh vừa nhập không phù hợp. Vui lòng nhập lại: ");
            } else {
                calculateTriangle(a, b, c);
                break;
            }
        } while (!checkLegitTriangle(a, b, c));

    }

    public static boolean checkLegitTriangle(double a, double b, double c) {
        boolean flag = true;

        if (a <= 0 || b <= 0 || c <= 0) {
            flag = false;
        } else {
            if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
                flag = false;
            }
        }
        return flag;
    }
    public static void calculateTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
//        Tính diện tích tam giác theo công thức Heron
        double area = Math.sqrt(p * (p - a) + p * (p - b) + p * (p - c));
        System.out.println("Chu vi của hình tam giác có độ dài 3 cạnh là " + a + "," + b + " và " + c + " là: " + (2 * p));
        System.out.println("Diện tích của hình tam giác có độ dài 3 cạnh là " + a + "," + b + " và " + c + " là: " + area);
    }
}
