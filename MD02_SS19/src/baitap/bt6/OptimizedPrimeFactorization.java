package baitap.bt6;

class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int number = 2; number <= 100; number++) {
            if (isPrimeOptimized(number)) {
                System.out.println("Optimized Prime Factorization: " + number);
            }
        }
    }

    private boolean isPrimeOptimized(int n) {
        if (n <= 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

