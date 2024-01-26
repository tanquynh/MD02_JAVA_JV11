package bt13;

import java.util.Scanner;
import java.util.Stack;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi số: ");
        String input = scanner.nextLine();

        boolean result = isPrimeSequence(input);

        if (result) {
            System.out.println(input + " là dãy số nguyên tố.");
        } else {
            System.out.println(input + " không là dãy số nguyên tố.");
        }
    }

    private static boolean isPrimeSequence(String input) {
        Stack<Character> charStack = new Stack<>();

        // Bước 2: Duyệt qua từng ký tự trong chuỗi đầu vào
        for (char ch : input.toCharArray()) {
            // Kiểm tra xem ký tự có phải là số hay không
            if (Character.isDigit(ch)) {
                charStack.push(ch);
            }
        }

        // Bước 3: Lấy từng ký tự từ stack và kiểm tra xem chúng có phải là số nguyên tố hay không
        while (!charStack.isEmpty()) {
            char currentChar = charStack.pop();
            int currentNumber = Character.getNumericValue(currentChar);

            if (!isPrime(currentNumber)) {
                return false;
            }
        }

        // Bước 4: Kết thúc chương trình
        return true;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
