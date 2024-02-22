package baitap.bt8;

public class Main {
    public static void main(String[] args) {
        SharedVariable sharedVariable = new SharedVariable();
        IncreeThread increeThread = new IncreeThread(sharedVariable);
        DecreeThread decreeThread = new DecreeThread(sharedVariable);
        increeThread.start();
        decreeThread.start();
    }
}
