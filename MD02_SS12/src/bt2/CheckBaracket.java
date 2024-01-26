package bt2;

import java.util.Scanner;
import java.util.Stack;

public class CheckBaracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Nhập chuôi");
        String st = sc.nextLine();
        char[] charArray = st.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            if(c == '(' || c == '{' || c =='[') {
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty() || !isMatchingBaraket(stack.pop(),c)) {
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

    private static boolean isMatchingBaraket(Character open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
