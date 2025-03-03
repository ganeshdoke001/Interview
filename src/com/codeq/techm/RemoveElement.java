package com.codeq.techm;

/*
 * 27. Remove Element Input: nums = [3,2,2,3], val = 3 -> Output: 2, nums = [2,2,_,_]
 */
public class RemoveElement {

    public static void main(
            String arg[]) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(
            int[] nums,
            int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
