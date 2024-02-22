package baitap.bt4;

public class NumberGenerator implements Runnable {
    String aaa;

    public NumberGenerator(String aaa) {
        this.aaa = aaa;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i + ", Thread ID: " + Thread.currentThread().getId() +
                    ", HashCode: " + this.hashCode() + aaa);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
