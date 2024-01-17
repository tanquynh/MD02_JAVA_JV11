package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");

        String input = sc.nextLine();
        if(input.isEmpty()) {
            System.out.println("Mang rong");
        } else {
            System.out.println("Mang khong rong");
        }
    }
}
