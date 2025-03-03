package com.codeq.sort;

/*
 * time complexity Best: O(n) Average: O(n^2) Worst: O(n^2) Space Complexity :O(1)
 */
public class bubbleSort {

    public static void main(
            String arg[]) {

        int a[] = {2, 5, 7, 3, 1};
        int n = a.length - 1;
        int swap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }

        for (int p : a) {
            System.out.print(p + ", ");
        }
    }
}
