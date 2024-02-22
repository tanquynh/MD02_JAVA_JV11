package baitap.bt2;

public class Mythread implements Runnable{
    @Override
    public void run() {
        int total = 0;
        for (int i = 1; i < 100; i++) {
            total+=i;
        }
        System.out.println("tổng "+total);
    }
}
