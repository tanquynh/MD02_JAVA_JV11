package ra.bt4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String input = sc.nextLine();
        String [] words = input.split("//s+");
        System.out.println(Arrays.toString(words));
    }
}
