package bt.bt7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biggerNo=0;
        boolean validInput = false;
        do {
            try {
                System.out.println("Nhập số nguyên 1:");
                int no1 = sc.nextInt();
                biggerNo = no1;
                System.out.println("Nhập số nguyên 2:");
                int no2 = sc.nextInt();
                if (no2 > no1) {
                    biggerNo = no2;
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("1 trong 2 số không phải số nguyên, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while (!validInput);
        System.out.println("Số lớn hơn là "+biggerNo);

    }
}