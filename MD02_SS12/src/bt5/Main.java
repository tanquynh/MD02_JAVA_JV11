package bt5;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap phép toán cần so sánh");
        String str = new Scanner(System.in).nextLine();
        if(checkBrackets(str)) {
            System.out.println("Bieu thuc du ngoac");
        } else {
            System.out.println("Bieu thuc thieu ngoac");
        }

    }

    public static boolean checkBrackets(String str) {
        Stack<Character> stack =new Stack<>();
        for (int i = 0; i < str.length(); i++) {
           char symbol = str.charAt(i);
           if(symbol == '(') {
               stack.push(symbol);
           } else if(symbol == ')') {
               if(stack.isEmpty()) {
                   return false;
               }
               if(!stack.pop().equals('(')) {
                   return false;
               }

           }

        }
        return stack.isEmpty();
     }
}
