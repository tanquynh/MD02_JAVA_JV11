package ra.bt9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can ktra :");
        String input = sc.nextLine();
        String str = "Hom nay an chao";
        if(str.contains(input)) {
            System.out.println("Co chua chuoi moi nhap");
        } else {
            System.out.println("Khong chua chuoi moi nhap");
        }
    }

}
