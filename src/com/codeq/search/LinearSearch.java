package com.codeq.search;

/*
 * Binary search Time complexity: O(log n) Space complexity: O(1)
 */

/*
 * Linear Search Time Complexity: O(n) Space O(n)
 */
public class LinearSearch {

    public static void main(
            String str[]) {

        int n[] = {4, 5, 6, 7, 8, 9};
        int target = 6;

        int index = binarySearch(n, target);
        if (index == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found at position : " + index);
        }
    }

    public static int leanerSearch(
            int[] n,
            int target) {

        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(
            int n[],
            int target) {

        int start = 0;
        int end = n.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (n[mid] == target) {
                return mid;
            } else if (n[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
