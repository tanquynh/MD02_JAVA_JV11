package ra.bt14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu");
        String str = sc.nextLine();
        System.out.println("Nhap do dai can ktra");
        int num = Integer.parseInt(sc.nextLine());
        if(countNumber(str , num) > 0) {
            System.out.println("So luong tu co do dai lon hon hoac bang " + num+ " là :" +countNumber(str, num));
        } else {
            System.out.println("Khong co tu nao hop le");
        }
    }

    private static int countNumber(String str , int num) {
        String [] words = str.split("\\s");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= num) {
                count += 1;
            }
        }
        return count;
    }
}
