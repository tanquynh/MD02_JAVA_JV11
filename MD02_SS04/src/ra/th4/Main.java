package ra.th4;

import ra.th3.Category;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.println("Nhap a = ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap b = ");
        double b = Double.parseDouble(sc.nextLine());
        cal.setA(a);
        cal.setB(b);
        System.out.println("Tong 2 so :" + cal.add() );
        System.out.println("Hieu 2 so :" + cal.sub() );
        System.out.println("Tich 2 so :" + cal.multi() );
        System.out.println("Thuong 2 so :" + cal.div() );
    }
}
