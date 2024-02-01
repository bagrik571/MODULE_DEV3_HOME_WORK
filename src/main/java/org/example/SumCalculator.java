package org.example;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException{
        int someSum = 0;
        if (n <= 0) {
            throw new IllegalArgumentException("Error value. Please enter n > 0!");
        }
        for (int i = 1; i <= n; i++) {
            someSum += i;
        }
        return someSum;
    }
}
