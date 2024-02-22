package bt.bt9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vị trí trong dãy:");
            int index = sc.nextInt();

            if (index < 0) {
                throw new Exception("Vị trí không hợp lệ");
            }

            List<Integer> fibonaciSequel = new ArrayList<>();
            fibonaciSequel.add(0);
            fibonaciSequel.add(1);
            if (index > 1) {
                for (int i = 2; i <= index; i++) {
                    Integer nextValue = fibonaciSequel.get(i - 1) + fibonaciSequel.get(i - 2);
                    fibonaciSequel.add(i, nextValue);
                }
            }
            System.out.println("Số ở vị trí " + index + " là " + fibonaciSequel.get(index));
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: vị trí không hợp lệ");

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}