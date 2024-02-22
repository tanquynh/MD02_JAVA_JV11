package baitap.bt8;

public class SharedVariable {
    private int variable = 1;

    public SharedVariable() {
    }

    public int getVariable() {
        return variable;
    }

    public void increment() {
        variable++;
    }

    public void decrement() {
        variable--;
    }


}
