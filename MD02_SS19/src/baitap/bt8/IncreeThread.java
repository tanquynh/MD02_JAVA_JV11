package baitap.bt8;

public class IncreeThread extends Thread {
    private SharedVariable sharedVariable;

    public IncreeThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    @Override
    public void run() {
        while (true) {
            sharedVariable.increment();
            System.out.println("Incremented: " + sharedVariable.getVariable());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
