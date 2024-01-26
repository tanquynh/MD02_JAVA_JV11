package bt3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập đoạn văn");
        String st = sc.nextLine();
        String[]para = st.split("\\s+");
        Stack<String> stack = new Stack<>();
        int numberOfWord = 0;
        for (int i = 0; i < para.length; i++) {
            System.out.println("Nhap từ thứ " + (i+1) + " " + para[i]);
            stack.push(para[i]);
            numberOfWord++;

        }
        System.out.println("So luong tu nhap " + numberOfWord);
       while (!stack.isEmpty()) {
           System.out.print(stack.pop() + " ");
       }

    }
}
