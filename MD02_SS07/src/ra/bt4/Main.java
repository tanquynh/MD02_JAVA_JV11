package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length side1 : ");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the length side2 : ");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the length side3 : ");
        double side3 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the color");
        String color = sc.nextLine();
        Triangle triangle = new Triangle(color,side1,side2,side3);
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle: " + triangle);
    }
}
