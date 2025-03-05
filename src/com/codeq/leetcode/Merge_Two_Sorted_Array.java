package com.codeq.leetcode;

import java.util.Arrays;

// 88. Merge Sorted Array
public class Merge_Two_Sorted_Array {

    public static int[] merge(
            int[] nums1,
            int m,
            int[] nums2,
            int n) {

        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];

            } else {
                nums1[i--] = nums2[p2--];
            }
        }
        return nums1;
    }

    public static void main(
            String arg[]) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
}
