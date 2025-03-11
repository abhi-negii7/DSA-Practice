public class _7LlImplem {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LlStack {
        private Node top = null;
        private int size = 0;

        // Insert an element in Stack
        void push(int x) {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size++;
        }

        // Delete an element from Stack
        int pop() {
            if (size == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int delNum = top.val;
            top = top.next;
            size--;
            return delNum;
        }

        // To print the Linked List
        void display() {
            displayRec(top);
            System.out.println();
        }

        void displayRec(Node head) {
            if (head == null) {
                return;
            }
            displayRec(head.next);
            System.out.print(head.val + " ");
        }

        // To get the size of Stack
        int size() {
            return size;
        }

        // Is Empty method
        boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        LlStack st = new LlStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();

    }
}
