package com.codeq.techm;

/*
 * 
 * 
 * 21. Merge Two Sorted Lists
 */

class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {

        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {

        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {

        return "ListNode [val=" + val + ", next=" + next + "]";
    }

}

public class Merge_Two_Sorted_Lists {

    public static void main(
            String arg[]) {

        /*
         * Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
         */
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println(merge(list1, list2));

    }

    public static ListNode merge(
            ListNode list1,
            ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            // merge List
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1 != null ? list1 : list2;

        return dummy.next;
    }
}
