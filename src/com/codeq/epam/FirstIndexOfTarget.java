package com.codeq.epam;

/*
 * WAP to find the first index of given target from a given sorted non-decreasing array. Ex: array a
 * = [-2, -1, 3, 3, ,3, 10,10,10,23], target = 10 output = 5; You have to do this in log(n) time
 * complexity.
 */
public class FirstIndexOfTarget {

    public static void main(
            String arg[]) {

        int nums[] = {-2, -1, 3, 3, 3, 10, 10, 10, 23};
        int target = 10;
        int index = findFirstIndex(nums, target);
        if (index != -1) {
            System.out.println("element is found at position : " + index);
        } else {
            System.out.println("Element is not found");
        }
    }

    public static int findFirstIndex(
            int[] nums,
            int target) {

        int firstIndex = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return firstIndex;
    }
}
