
// Queue is based on the principle LIFO
import java.util.*;

public class _1IntroQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();

        // isEmpty() method to check the queue is empty or not
        System.out.println(q.isEmpty());

        // Add element in Queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Remove element in Queue
        q.remove();
        q.poll();
        System.out.println(q);

        // To seek the element that is at the front
        System.out.println(q.peek());
        System.out.println(q.element());

        // Size of the Queue
        System.out.println("Queue size is : " + q.size());
    }
}
