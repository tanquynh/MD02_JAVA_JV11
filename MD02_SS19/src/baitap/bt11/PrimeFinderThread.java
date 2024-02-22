package baitap.bt11;

import java.util.List;

class PrimeFinderThread extends Thread {
    private int start;
    private int end;
    private List<Integer> primeList;

    public PrimeFinderThread(int start, int end, List<Integer> primeList) {
        this.start = start;
        this.end = end;
        this.primeList = primeList;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
