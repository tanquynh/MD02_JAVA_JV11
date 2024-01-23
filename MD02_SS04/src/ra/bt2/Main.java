package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giai Phuong trinh bac 2");
        System.out.println("Giải phương trình a*x^2 + b*x +c");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap gia tri b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap gia tri c");
        double c = Double.parseDouble(sc.nextLine());
        solveQuadraticEquation(a,b,c);
    }

    private static void solveQuadraticEquation(double a, double b, double c) {
    QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Giải phương trình " + a + "*x^2 + " + b + "*x +" + c + ":");
        if(quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("r1 = " + quadraticEquation.getRoot1());
            System.out.print("r2 = " + quadraticEquation.getRoot2());
        } else if(quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep");
            System.out.println("r = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
