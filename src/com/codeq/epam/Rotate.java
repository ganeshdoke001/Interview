package com.codeq.epam;

/*
 * 61. Rotate List : Rotate a linked list by K spots Given the head of a linked list, rotate the
 * list to the right by k places. Input: head = [1,2,3,4,5], k = 2 Output: [4,5,1,2,3]
 */

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {

        this.val = val;
        this.next = null;
    }
}

public class Rotate {

    public static void main(
            String arg[]) {

        // head = [1,2,3,4,5]
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        int k = 2;
        node = rotate(node, k);

        while (node != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
    }

    public static ListNode rotate(
            ListNode head,
            int k) {

        if (k == 0 || head == null) {
            return head;
        }

        for (int i = 0; i <= k; i++) {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            // move the current Node to last
            curr.next = head;
            curr = curr.next;
            head = head.next;
            curr.next = null;

        }
        return head;

    }
}
