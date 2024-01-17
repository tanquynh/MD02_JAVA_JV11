package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi muốn đảo ngược: ");
        String str = sc.nextLine();
        StringBuffer strReverse = new StringBuffer(str);
        System.out.print("Chuỗi trước khi đảo ngược là: " + "\u001b[32m" + str+ "\u001b[0m");
        System.out.println();
        System.out.println("Chuỗi sau khi đảo ngược là: " + "\u001b[32m" + strReverse.reverse());

    }
}
