package bt1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(2);
        queue.offer(4);
        queue.offer(3);
        queue.offer(7);
        while (!queue.isEmpty()) {
            System.out.print(queue.remove());
        }
    }
}
