package bt2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String input = sc.nextLine();
        // b1 : Tao stack rỗng
        Stack<Character> stack = new Stack<>();
        // b2 : Duyệt ký tự nhập vào
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == '(' || ch == '{' || ch =='[') {
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()) {
                    System.err.println("Không có cặp dấu ngoặc");
                    return;
                }
                char openBracket = stack.pop();
                if(!isMatchingBracket(openBracket, ch)) {
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
            }

        }
        boolean check = stack.isEmpty();
        if(check) {
            System.out.println("Có cac cặp ngoặc hợp lệ");
        }
        else System.out.println("Không có cặp ngoặc");
    }

    private static boolean isMatchingBracket(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
    }
}
