package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào chuỗi thứ nhất: ");
        String str1 = sc.nextLine();
        System.out.print("Vui lòng nhập vào chuỗi thứ hai: ");
        String str2 = sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Hai chuỗi vừa nhập vào giống nhau.");
        } else {
            System.out.println("Hai chuỗi vừa nhập vào khác nhau.");
        }
    }
}
