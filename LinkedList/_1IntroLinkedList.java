import java.util.*;

class Node {
    int data; // data
    Node next; // address of the next node

    Node(int data) {
        this.data = data;
    }
}

class _1IntroLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        // System.out.println(n1.next); //null
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(50);
        n1.next = n2; // 10 -> 20
        n2.next = n3; // 10 -> 20 -> 30
        n3.next = n4;// 10 -> 20 -> 30 -> 40
        // System.out.println(n1.next);
        // Node@2f92e0f4
        // System.out.println(n2);
        // Node@2f92e0f4

        // Display a singly linked List

        display(n1);
        // System.out.println(n1.data);
        // System.out.println(n2.data);
        // System.out.println(n3.data);

        // System.out.println(n1.data);
        // System.out.println(n1.next.data);
        // System.out.println(n1.next.next.data);
        // System.out.println(n1.next.next.next.data);

        // Node temp = n1;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // display the function recursively
        // displayR(n1);

        // display the linkedList in reverse
        displayReverse(n1);

    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void displayR(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static void displayReverse(Node head) {
        if (head == null)
            return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }
}