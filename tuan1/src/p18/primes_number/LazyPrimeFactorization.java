package p18.primes_number;

import java.util.ArrayList;
import java.util.List;

public class LazyPrimeFactorization implements Runnable {

    private List<Integer> primeFactors;

    public LazyPrimeFactorization() {
        primeFactors = new ArrayList<>();
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

    @Override
    public void run() {
        int number = 0;
        while (number <= 10000) {
            if (isPrime(number)) {
                primeFactors.add(number);
                System.out.println("Lazy Prime Factorization found a new prime number: " + number);
            }
            number++;
        }
        System.out.println("Lazy Prime Factorization found " + primeFactors.size() + " prime numbers");
    }
}


