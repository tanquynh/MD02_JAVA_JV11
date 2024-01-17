package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào một chuỗi bất kỳ: ");
        String string = sc.nextLine();
        if (string.isEmpty()) {
            System.out.println("Bạn vừa nhập vào một chuỗi rỗng.");
        } else {
            System.out.print("Bạn vừa nhập vào chuỗi: " + "\u001b[32m"+ string);
        }
    }
}
