package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String input = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer(input);
        StringBuffer str = stringBuffer.reverse();
        System.out.println(str);
    }
}
