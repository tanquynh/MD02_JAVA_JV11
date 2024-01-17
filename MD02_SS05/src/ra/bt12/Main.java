package ra.bt12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String input = scanner.nextLine();
        System.out.println("Chuoi nhap vao :" + input);
        System.out.println("Chuoi thay doi ki tu i thanh t :" + input.replace("i","t"));
    }
}
