package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can thay the");
        String input = sc.nextLine();
        String result = Replace(input);
        System.out.println("Chuoi sau thay doi :" + result);
    }

    private static String Replace(String input) {
        StringBuffer stringBuffer = new StringBuffer("Viet Nam dep lam");
        return  stringBuffer.replace(0,7,input).toString();
    }
}
