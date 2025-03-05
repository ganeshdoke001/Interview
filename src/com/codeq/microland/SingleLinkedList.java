package com.codeq.microland;

class Node {

    int value;
    Node next;

    public Node(int value) {

        this.value = value;
        this.next = null;
    }
}

public class SingleLinkedList {

    Node head;

    public SingleLinkedList() {

        this.head = null;
    }

    public void add(
            int value) {

        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public static Node reverse(
            Node node) {

        Node pre = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;

        }
        return pre;
    }

    public void print(
            Node node) {

        Node current = node;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(
            String arg[]) {

        SingleLinkedList list = new SingleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.print(list.head);
        Node node = reverse(list.head);
        list.print(node);
    }
}
