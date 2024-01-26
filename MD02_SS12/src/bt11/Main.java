package bt11;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int smallest = findSmallestElement(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + smallest);
    }

    public static int findSmallestElement(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        // Thêm các phần tử của mảng vào queue
        for (int num : arr) {
            queue.add(num);
        }

        // Lấy phần tử đầu tiên ra khỏi queue
        int smallest = queue.poll();

        // So sánh phần tử đầu tiên với các phần tử khác trong queue
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current < smallest) {
                smallest = current;
            }
        }

        return smallest;
    }
}
