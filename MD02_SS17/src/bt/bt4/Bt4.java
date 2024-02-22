package bt.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi gốc: ");
        String string = sc.nextLine();
        char[] array = string.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (char character : array) {
            try {
                Integer value = Integer.parseInt(String.valueOf(character));
                list.add(value);

            } catch (NumberFormatException e) {
                System.out.println("Lỗi " + e.getMessage());
                list.add(0);
            }

        }

        System.out.println("Kết quả là " + list);
    }
}