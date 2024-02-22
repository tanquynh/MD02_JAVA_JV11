package baitap.bt1;

public class Main {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        Runnable thread1=()->{
            System.out.println("1234567");
        };
       thread1.run();
    }
}
