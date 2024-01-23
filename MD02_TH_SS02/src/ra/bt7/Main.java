package ra.bt7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Tạo ứng dụng tính chu vi và diện tích các loại hình
        Scanner sc = new Scanner(System.in);
        int menuSelection;
        System.out.println("Nhập số để lựa chọn thao tác muốn thực hiện từ menu dưới dây: ");
        System.out.println("1.Tính chu vi và diện tích của hình chữ nhật\n2.Tính chu vi và diện tích của hình tam giác\n3.Tính chu vi và diện tích của hình tròn\n4. Thoát");
        menuSelection = sc.nextInt();
        switch (menuSelection) {
            case 1:
                System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
                double width = sc.nextDouble();
                System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
                double height = sc.nextDouble();
                calculateRectangle(width, height);
                break;
            case 2:
                System.out.print("Nhập vào độ dài cạnh thứ nhất: ");
                double a = sc.nextDouble();
                System.out.print("Nhập vào độ dài cạnh thứ hai: ");
                double b = sc.nextDouble();
                System.out.print("Nhập vào độ dài cạnh thứ ba: ");
                double c = sc.nextDouble();
                calculateTriangle(a, b, c);
                break;
            case 3:
                System.out.print("Nhập vào bán kính đường tròn: ");
                double r = sc.nextDouble();
                calculateCircle(r);
                break;
            case 4:
                System.exit(0);
                break;
        }

    }

    public static void calculateRectangle(double width, double height) {
        System.out.println("Chu vi của hình chữ nhật có chiều dài " + width + " và chiều rộng " + height + " là " + 2 * (width + height));
        System.out.println("Diện tích của hình chữ nhật có chiều dài " + width + " và chiều rộng " + height + " là " + (width * height));
    }

    public static void calculateTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
//        Tính diện tích tam giác theo công thức Heron
        double area = Math.sqrt(p * (p - a) + p * (p - b) + p * (p - c));
        System.out.println("Chu vi của hình tam giác có độ dài 3 cạnh là " + a + "," + b + " và " + c + " là: " + (2 * p));
        System.out.println("Diện tích của hình tam giác có độ dài 3 cạnh là " + a + "," + b + " và " + c + " là: " + area);
    }

    public static void calculateCircle(double r) {
        System.out.println("Chu vi của hình tròn có bán kính " + r + " là : " + 2 * Math.PI * r);
        System.out.println("Diện tích của hình tròn có bán kính " + r + " là : " + Math.PI * Math.pow(r, 2));
    }
}
