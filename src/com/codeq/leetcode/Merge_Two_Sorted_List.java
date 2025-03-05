package com.codeq.leetcode;

class ListNode {

    int value;
    ListNode next;

    public ListNode(int value) {

        this.value = value;
        this.next = null;
    }
}

public class Merge_Two_Sorted_List {

    ListNode head;

    public Merge_Two_Sorted_List() {

        this.head = null;
    }

    public void add(
            int value) {

        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
        } else {
            ListNode current = node;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public static ListNode mergeTwoLists(
            ListNode l1,
            ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            // merge two sorted List
            if (l1.value <= l2.value) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : l2;
        return dummy.next;
    }

    public static void print(
            ListNode node) {

        ListNode current = node;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(
            String arg[]) {

        // list1 = [1,2,4], list2 = [1,3,4]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode node = mergeTwoLists(l1, l2);
        print(node);

    }
}
