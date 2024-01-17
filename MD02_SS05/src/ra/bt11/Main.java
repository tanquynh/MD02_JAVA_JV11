package ra.bt11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi " );
        String input = sc.nextLine();
        System.out.println("chuoi nhap vao : " + input);
        System.out.println("chuoi sau khi cat khoang trang 2 dau :" + input.trim());
    }
}
