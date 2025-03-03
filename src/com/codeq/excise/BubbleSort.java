package com.codeq.excise;

import java.util.Arrays;

public class BubbleSort {

    public static void main(
            String arg[]) {

        int nums[] = {3, 2, 6, 4, 9, 1};

        System.out.println(Arrays.toString(sort(nums)));

    }

    public static int[] sort(
            int nums[]) {

        int n = nums.length - 1;
        int swap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                }
            }
        }
        return nums;
    }
}
