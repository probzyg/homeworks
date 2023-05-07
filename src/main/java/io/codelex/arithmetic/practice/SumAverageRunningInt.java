package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0,
                lowerBound = 1,
                upperBound = 100;
        float average;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = (float) sum / upperBound;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }
}
