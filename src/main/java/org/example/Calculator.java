package org.example;

public class Calculator {

    // Method to calculate factorial
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate binomial coefficient
    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid parameters. Ensure that 0 <= k <= n and both are non-negative.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}


