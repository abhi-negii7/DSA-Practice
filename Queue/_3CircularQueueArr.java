class CircularQueue {
    int[] arr = new int[4];
    int rear = -1, front = -1;
    int size = 0;
    int n = arr.length;

    public void add(int val) throws Exception{
        if (size == n) {
            throw new Exception("Queue is full");

        } else if (front == -1) {
            front = rear = 0;
            arr[0] = val;
        } else if (rear == n - 1) {
            rear = 0;
            arr[0] = val;
        } else {
            arr[++rear] = val;
        }
        size++;

    }

    public int remove() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int x = arr[front];
        if (front == rear)
            front = rear = -1;
        else if (front == n - 1)
            front = 0;
        else
            front++;
        size--;
        return x;
    }

    public int peek() throws Exception {
        if (size == 0)
            throw new Exception("Queue is Empty");
        else
            return arr[front];
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

public class _3CircularQueueArr {
    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue();
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        // cq.add(50);
        // cq.remove();
        // cq.remove();
        // cq.remove();
        // cq.remove();

        cq.add(70);
        cq.remove();
        System.out.println(cq.front);
        System.out.println(cq.rear);
        cq.display();
    }
}
