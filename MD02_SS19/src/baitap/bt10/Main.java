package baitap.bt10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runnable runnable = () -> {
            System.out.println("nhập số thời gian s");
            int s = Integer.parseInt(sc.nextLine());
            System.out.println("bắt đầu ngủ");
            try {
                Thread.sleep(s * 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("kết thúc");
        };
        runnable.run();
        System.out.println("aaaaaaa");
    }
}
