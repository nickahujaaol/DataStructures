package com.finalprep.arrays;

import java.util.Arrays;

public class SumOfNPrimeNumbers {
    public static void main(String[] args) {
        int sum = sumOfPrimes(100);
        System.out.println(sum);
    }

    private static int sumOfPrimes(int number) {
        boolean prime[]=new boolean[number + 1];

        // Create a boolean array "prime[0..n]"
        // and initialize all entries it as true.
        // A value in prime[i] will finally be
        // false if i is Not a prime, else true.
        Arrays.fill(prime, true);

        for (int p = 2; p < Math.sqrt(number); p++) {

            // If prime[p] is not changed, then
            // it is a prime
            if (prime[p] == true) {

                // Update all multiples of p
                for (int i = p * 2; i <= number; i += p)
                    prime[i] = false;
            }
        }

        // Return sum of primes generated through
        // Sieve.
        int sum = 0;
        for (int i = 2; i <= number; i++)
            if (prime[i])
                sum += i;
        return sum;
    }
}
