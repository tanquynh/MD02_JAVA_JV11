package bt10;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 10, 5, 2, 7, 8, 1};
        int maxElement = findMaxElement(inputArray);

        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }
    public static int findMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Mảng không hợp lệ.");
        }

        Stack<Integer> stack = new Stack<>();

        // Bước 2: Duyệtphần tử mảng
        for (int element : array) {
            // Bước 2a: Nếu stack rỗng hoặc phần tử đang xét lớn hơn phần tử trên đỉnh của stack, đưa phần tử đó vào stack
            if (stack.isEmpty() || element > stack.peek()) {
                stack.push(element);
            } else {
                // Bước 2b: Ngược lại, lấy phần tử trên đỉnh của stack ra khỏi stack
                stack.pop();
            }
        }

        // Bước 3: Phần tử lớn nhất nằm trên đỉnh của stack
        return stack.peek();
    }
}
