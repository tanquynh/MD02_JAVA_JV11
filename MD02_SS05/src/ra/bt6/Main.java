package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String input = sc.nextLine();
        System.out.println("nhap vi tri can chen");
        int index = Integer.parseInt(sc.nextLine());
        String result = insertInfor( input,  index);
        System.out.println("chuoi sau khi chen : "+result);
    }

    private static String insertInfor(String input, int index) {
        StringBuilder stringBuilder = new StringBuilder("Hom nay an gi");
       return stringBuilder.insert(index,input).toString();

    }
}
