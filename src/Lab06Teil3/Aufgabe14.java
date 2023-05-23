package Lab06Teil3;

import java.util.Arrays;

public class Aufgabe14 {
    public static void main(String[] args) {
        // This is_prime function works by checking each number from 2 up to the square root of n to see if n is divisible by it.
        // If n is divisible by any of these numbers, it is not a prime number.
        // This works because a larger factor of the number would be a multiple of smaller factor that has already been checked.
        // For example, while checking 100, there's no need to check divisibility by 10, because you would have already checked divisibility by 2 and 5, which are factors of 10.
        // The function only needs to check up to the square root of n because a larger factor of n must be a multiple of smaller factor that has already been checked.
        // The function returns true if no factors are found, and false otherwise.

        System.out.println(is_prime(2));  // Should return true
        System.out.println(is_prime(4));  // Should return false
        System.out.println(is_prime(17)); // Should return true
    }

    public static boolean is_prime(int n) {
        // Check if n is less than 2 (the smallest prime number is 2)
        if (n < 2) {
            return false;
        }
        // Check from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            // If n is divisible by any number between 2 and the square root of n, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // If we've made it this far, n is prime
        return true;
    }

    public static boolean is_prime_sieve(int n) {
        // Create an array of boolean values, all set to true initially
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;  // 0 and 1 are not prime

        // For each number from 2 to n
        for (int i = 2; i * i <= n; i++) {
            // If primes[i] is true, then i is a prime number
            if (primes[i]) {
                // Set multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        // If n is prime, primes[n] will still be true
        return primes[n];
    }
}


