public class ReverseList {
    Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(10);
        Node n3 = new Node(10);
        Node n4 = new Node(10);
        Node n5 = new Node(10);

        n2 = n1.next;
        n3 = n2.next;
        n4 = n3.next;
        n5 = n4.next;

        display(n1);

    }
}
