package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int N = 8;
        long sum = 1;
        for (int i = 1; i < N + 1; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
