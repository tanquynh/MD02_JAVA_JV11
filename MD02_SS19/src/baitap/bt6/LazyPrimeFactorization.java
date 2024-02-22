package baitap.bt6;

class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.println("Lazy Prime Factorization: " + number);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

