package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("Cho chuỗi:");
        System.out.println(str);
        System.out.print("Nhập vào một ký tự để kiểm tra tần số xuất hiện trong chuỗi trên: ");
        char ch = sc.next().charAt(0);
        System.out.println("Ký tự " + ch + " đã xuất hiện " + countCharacterOccurences(ch, str) + " lần trong chuỗi.");

    }

    public static int countCharacterOccurences(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
