package baitap.bt6;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimizedThread = new Thread(optimizedPrimeFactorization);

        lazyThread.start();
        optimizedThread.start();
    }
}
