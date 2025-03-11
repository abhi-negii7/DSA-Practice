// Implement the Queue using the Array

public class _2ArrayImplem {
    public static class queueA {
        int rear = -1;
        int front = -1;
        int[] arr = new int[5];
        int size = 0;

        // Method to add the element in Queue
        void add(int val) {

            if (size == arr.length) { // Queue full
                System.out.println("Queue is full ");
                return;
            }
            if (front == -1) { // Queue empty front=-1 & rear=-1
                front++;
            }
            arr[++rear] = val;
            size++;
        }

        // Method to remove the element in Queue
        int remove() {

            if (front == -1) { // Queue empty
                System.out.println("Queue is Empty ");
                return -1;
            } else if (front == rear) { // Only one element in queue
                int x = arr[front];
                rear = front = -1;
                size--;
                return x;
            }
            front++;
            size--;
            return arr[front - 1];
        }

        // Method to display the front element in queue
        int peek() {
            if (front == -1) { // Queue empty
                System.out.println("Queue is Empty ");
                return -1;
            }
            return arr[front];
        }

        // Method to display the whole queue
        void display() {
            if (front == -1) { // Queue empty
                System.out.println("Queue is Empty ");
                return;
            }
            for (int i = front; i <= rear; i++) { // print the queue from front to rear
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println(q.front + " " + q.rear);
        q.display();

    }
}
