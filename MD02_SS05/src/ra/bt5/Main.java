package ra.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap chuoi thu nhat");
        String st1 = sc.nextLine();
        System.out.println("Nhap chuoi thu hai");
        String st2 = sc.nextLine();
        System.out.println("Chuoi sau khi noi : " +st1.concat(" ").concat(st2));
    }
}
