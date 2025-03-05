package com.codeq.sort;

public class MissingNumber {

    public static void main(
            String arg[]) {

        int nums[] = {1, 8, 4, 2, 5, 6, 7};
        // op:3

        int sum = 0;
        int x = 0;
        for (int i = 0; i <= 8; i++) {
            sum = sum + i;
        }
        int sumAc = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAc = sumAc + nums[i];
        }
        x = sum - sumAc;
        System.out.println(x);
    }
}
