package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String input = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder("Viet Nam");
        stringBuilder.append(" ").append(input);
        System.out.println(stringBuilder.toString());
    }

}
