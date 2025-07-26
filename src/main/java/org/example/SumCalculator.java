package org.example;

public class SumCalculator {
    public int sum (int n) {
        if (n == 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number += i;
        }
        return number;
    }
    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();
        System.out.println(calc.sum(15));
    }
}