package com.codeq.leetcode;

import java.util.Arrays;

/*
 * 283. Move Zeroes
 */

public class MoveAllZeroToEndOfArray {

    public static int[] moveZeroes(
            int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while (count < nums.length) {
            nums[count++] = 0;
        }
        return nums;
    }

    public static void main(
            String arg[]) {
        // Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]

        System.out.println(Arrays.toString(moveZeroes(new int[] {0, 1, 0, 3, 12})));
    }
}
