package ra.th4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        THỰC HÀNH
//        Tính chỉ số cân nặng của cơ thể
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("BMI CALCULATOR");

        System.out.println("Input your weight (in kilograms): ");
        weight = sc.nextDouble();
        System.out.println("Input your height (in meters): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
//      đặt -20 sau % là để độ dài hiển thị cho phép của chuỗi đầu tiên là 20 ký tự tính từ trái qua
        System.out.printf("%-20s%s", "BMI", "INTERPRETATION\n");
        if (bmi < 18.0) {
            System.out.printf("%-20.2f%s", bmi, "Underweight\n");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal\n");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight\n");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese\n");
        }
    }
}
