package com.codeq.ey;

class Node {

    int value;
    Node next;

    public Node(int value) {

        this.value = value;
        this.next = null;
    }
}

public class LinkedNode {

    Node head;

    public LinkedNode() {

        this.head = null;
    }

    public void push(
            int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public static void main(
            String arg[]) {

        LinkedNode node = new LinkedNode();
        node.push(10);
        node.push(20);
        node.push(30);
        node.reverse();
        node.print();
    }
}
