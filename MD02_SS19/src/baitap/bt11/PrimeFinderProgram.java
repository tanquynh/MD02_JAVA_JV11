package baitap.bt11;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinderProgram {
    public static void main(String[] args) {
        List<Integer> primeList = new ArrayList<>();

        PrimeFinderThread thread1 = new PrimeFinderThread(1, 5000, primeList);
        PrimeFinderThread thread2 = new PrimeFinderThread(5001, 10000, primeList);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("List of prime numbers from 1 to 10000:");
        for (int prime : primeList) {
            System.out.print(prime + " ");
        }
    }
}


