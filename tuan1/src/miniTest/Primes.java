package miniTest;

import java.util.Scanner;

public class Primes {
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i * i <= number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.printf("Prime numbers less than %d are:\n", n);
        for (int i = 1; i <= n; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
