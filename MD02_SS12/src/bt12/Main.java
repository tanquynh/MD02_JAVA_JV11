package bt12;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String inputSequence = "54321";
        boolean result = isDecreasingSequence(inputSequence);

        if (result) {
            System.out.println(inputSequence + " là dãy giảm dần.");
        } else {
            System.out.println(inputSequence + " không là dãy giảm dần.");
        }
    }
    public static boolean isDecreasingSequence(String input) {
        Stack<Character> charStack = new Stack<>();

        // Bước 2: Đưa các ký tự của chuỗi vào stack
        for (char ch : input.toCharArray()) {
            charStack.push(ch);
        }

        // Bước 3: Khởi tạo biến flag
        boolean isDecreasing = true;

        // Bước 4 và Bước 5: Duyệt qua từng ký tự và so sánh
        for (char ch : input.toCharArray()) {
            if (ch > charStack.peek()) {
                isDecreasing = false;
                break;
            }
            charStack.pop();
        }
        return isDecreasing;
    }
}
