package bt.bt10;

import java.util.Scanner;

public class Bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 0, area;
        boolean validInput=false;
        while (!validInput) {
            try {
                System.out.println("Nhập bán kính:");
                radius = sc.nextDouble();
                if (radius <= 0) {
                    throw new Exception("Bán kính không hợp lệ!");
                } else {
                    validInput=true;
                }

            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                sc.nextLine();
            }
        }

        area = Math.pow(radius, 2) * Math.PI;

        System.out.println("Bán kính: " + radius + ", diện tích: " + area);

    }
}