package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String st1 = sc.nextLine();
        String st2 = "word";
        if(st1.equals(st2)) {
            System.out.println("Hai chuoi giong nhau");
        } else {
            System.out.println("Hai chuoi khac nhau");
        }
    }
}
