public class implementation {

    static class Node { // This the structure of Node
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Insert At head Method
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // Insert At tail Method
        void insertAtTail(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtHead(val);
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            // if there exist not a single node or want to insert at head
            if (head == null || idx == 0) {
                insertAtHead(val);
            }
            // if we want to insert at tail
            else if (idx == size) {
                insertAtTail(val);
            }
            // wrong index insertion
            else if (idx < 0 || idx > size) {
                System.out.println("Wrong index, try again");
            }
            // insert at middle of list
            else {
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }

        // Delete at first
        public void deleteAtHead() {
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            head = head.next;
            size--;
        }

        // Delete at last
        public void deleteAtTail() {
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            size--;
            if (head.next == null) {
                head = null;
                return;
            }
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }

        // Delete at index

        void deleteAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
            } else if (idx == 0) {
                deleteAtHead();
            } else if (idx == size - 1) {
                deleteAtTail();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        void display() {
            Node temp = head;
            if (temp == null) {
                System.out.println("list is empty");
            }
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtTail(40);
        ll.insertAtTail(50);
        ll.insertAt(5, 20);
        ll.insertAt(0, 800);

        ll.deleteAt(3);

        // System.out.println("Head = " + ll.head.data + " tail = " + ll.tail.data + "
        // size = " + ll.size);
        ll.display();
    }
}
