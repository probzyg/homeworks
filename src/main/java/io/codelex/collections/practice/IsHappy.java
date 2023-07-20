package io.codelex.collections.practice;

import java.util.*;

public class IsHappy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number you want to check for happiness : ");
        int num = in.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is happy");
        }
        else {
            System.out.println(num + " is not happy");
        }
    }

    private static boolean isHappy(int num) {
        List<Integer> numList = new ArrayList<>();
        while (num != 1 && !numList.contains(num)) {
            numList.add(num);
            num = getNext(num);
        }
        return num == 1;
    }

    private static int getNext(int num) {
        int sum = 0;
        while (num != 0) {
            int current = num % 10;
            sum += Math.pow(current, 2);
            num /= 10;
        }
        return sum;
    }
}
