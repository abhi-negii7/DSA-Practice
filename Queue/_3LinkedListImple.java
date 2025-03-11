class QueueNode {
    int val;
    QueueNode next;

    QueueNode(int val) {
        this.val = val;
        next = null;
    }
}

class QueueLL {
    QueueNode rear = null;
    QueueNode front = null;
    int size = 0;

   public void enqueue(int val) {
        QueueNode temp = new QueueNode(val);
        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            System.exit(-1);
        }
        int delNum = front.val;
        front = front.next;
        size--;
        return delNum;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            System.exit(-1);
        }
        return front.val;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class _3LinkedListImple {

    public static void main(String[] args) {

        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        // q.enqueue(30);
        // q.enqueue(40);
        // q.enqueue(50);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();

    }

}